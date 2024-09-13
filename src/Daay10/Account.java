package Daay10;

public class Account {
	private int accno;
	private String name;
	private double balance;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	void setaccno(int accno) {
		this.accno=accno;
		//this keyword is used for class variable
	}
	
	int getaccno() {
		return accno;
	}
	

}
