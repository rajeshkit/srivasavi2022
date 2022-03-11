package com.bank.main;

import java.util.Scanner;

import com.bank.model.Bank;
import com.bank.service.BankService;

public class BankMain {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("1. Add Bank");
		System.out.println("2. Show All Bank");
		System.out.println("3. Delete Bank");
		System.out.println("3. Update Bank");
		
		System.out.println("Enter your choice");
		int choice=s.nextInt();
		switch(choice) {
		case 1:
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter the bank ID:");
			int bankId=s1.nextInt();
			s1.nextLine();
			System.out.println("Enter the bank Name: ");
			String bankName=s1.nextLine();
			System.out.println("Enter the IFSC code");
			String ifscCode=s1.nextLine();
			Bank b=new Bank();
			b.setId(bankId);
			b.setIfsc(ifscCode);
			b.setName(bankName);
			BankService bankService=new BankService();
			int status=bankService.createDepartment(b);
			if(status!=0) {
				System.out.println("Bank details added successfully");
			}else {
				System.out.println("Bank details not added successfully");
			}
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			break;
		default:
			
	break;
		}
	}

}
