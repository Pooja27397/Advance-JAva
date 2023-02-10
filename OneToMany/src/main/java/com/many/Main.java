package com.many;

import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {// two jar hibernate and mysql
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		//oneToMany
		User user=new User();
		user.setCity("pune");
		user.setName("Sachin");
		user.setEmail("sachin@gmail.com");
		
		Account account1=new Account("HSBC", "124587", "active", user);
		Account account2=new Account("SBI", "124587", "active", user);
		Account account3=new Account("IDBI", "124587", "active", user);
		Account account4=new Account("BOI", "124587", "active", user);
		
		
		/*Account account1=new Account();
		account1.setAccountNumber("123456");
		account1.setAccountStatus("active");
		account1.setBankName("HDFC");
		account1.setUser(user);
		
		
		Account account2=new Account();
		account2.setAccountNumber("23456");
		account2.setAccountStatus("active");
		account2.setBankName("IDBI");
		account2.setUser(user);
		
		Account account3=new Account();
		account3.setAccountNumber("345678");
		account3.setAccountStatus("active");
		account3.setBankName("ICICI");
		account3.setUser(user);*/
		
		Set<Account> set=new HashSet<Account>();
		set.add(account1);
		set.add(account2);
		set.add(account3);
		set.add(account4);
		
		user.setAccount(set);
		session.save(user);
		//session.save(set);
		session.save(account2);
		session.save(account1);
		session.save(account3);
		session.save(account4);
		
		tr.commit();
		session.close();
		System.out.println("data inserted successfully...");
	}
}
