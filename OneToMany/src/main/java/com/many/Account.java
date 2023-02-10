package com.many;

@Entity
@Table(name="account_table")
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="acc_id")
	private int id;
	private String bankName;
	private String accountNumber;
	private String accountStatus;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
		
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", bankName=" + bankName + ", accountNumber=" + accountNumber + ", accountStatus="
				+ accountStatus + ", user=" + user + "]";
	}

}
