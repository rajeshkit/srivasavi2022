package com.icicibank.account;

public class Deposit {
	
	public void doDeposit() {
		Account a=new Account();
		System.out.println(a.accountNumber);
		System.out.println(a.accountHolderName);
		a.deposit();
		a.accountDetails();
	}

}
