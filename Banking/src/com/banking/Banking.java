package com.banking;

public class Banking {

	//instance variable
	String name;
	int accountnumber;
	String accounttype;
	double balance;
	
	//parameterized constructor
	public Banking(String name, int accountnumber, String accounttype, double balance) {
		super();
		this.name = name;
		this.accountnumber = accountnumber;
		this.accounttype = accounttype;
		this.balance = balance;
	}
	
	//default constructor
	public Banking() {
		
	}
	
	//deposit method
	public void deposit(double amount) {
		//code
		balance = balance + amount;
	}
	
	//withdrawal method
	public void withdraw(double amount) {
		//code
		balance = balance - amount;
	}
	
	//balance show method
	public void display() {
		//code
	}
	
	//show account detail method
	public void showdetail() {
		//code
		System.out.println("Account Holder Name: " + name);
		System.out.println("Account Number: " + accountnumber);
		System.out.println("Account Type: " + accounttype);
		System.out.println("Account Balance: "+ balance);
		
	}
}
