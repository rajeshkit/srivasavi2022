package com.icicibank.loan;

public class Customer {
	public void display() {
		PersonalLoan p=new PersonalLoan();
		System.out.println(p.getLoanId());
		System.out.println(p.getName());
		System.out.println(p.getLoanAmount());
		
	}
	public static void main(String[] args) {
		Customer c=new Customer();
		c.display();
		

	}
}
