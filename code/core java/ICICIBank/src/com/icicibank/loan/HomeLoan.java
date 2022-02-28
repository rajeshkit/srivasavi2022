package com.icicibank.loan;

import java.util.Scanner;

import com.icicibank.account.Account;

public class HomeLoan {
	public void getHomeLoan() {
		Account a=new Account();
		System.out.println(a.accountHolderName);
		System.out.println(a.accountNumber);
		a.deposit();
		a.accountDetails();
		Scanner s=new Scanner(System.in);
	}
}
