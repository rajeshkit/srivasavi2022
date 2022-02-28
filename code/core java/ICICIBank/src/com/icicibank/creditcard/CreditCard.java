package com.icicibank.creditcard;

import com.icicibank.account.Account;

public class CreditCard extends Account {
	public void getCreditCard() {
		
	}
	public static void main(String[] args) {
		Account account=new CreditCard();// implicit  object casting
		CreditCard cc=(CreditCard)new Account();// explicit object casting
	}
	
}
