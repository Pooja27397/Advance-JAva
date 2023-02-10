package com.maven;

public class Main {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		// insert data into database
		Student student = new Student();
		student.setName("ram");
		student.setCity("pune");
		student.setMobile("9595972678");
		session.save(student);
		t.commit();
		session.close();
		System.out.println("Record saved successfully.");
}
}