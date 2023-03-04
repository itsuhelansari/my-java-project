package com.banking;

public class BankingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Banking b1 = new Banking();
		b1.name = "Suhel Bhai";
		b1.accountnumber = 73219532;
		b1.accounttype = "Saving Account";
		b1.balance=12000;
		b1.deposit(1000);
		b1.withdraw(2000);
		b1.showdetail();
		
		

	}

}
