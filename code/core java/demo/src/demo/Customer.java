package demo;

import java.util.Scanner;

public class Customer {
	public static void main(String arg[]) {
		int customerId;// variable declaration
		int phone;
		byte id;
		short salary;
		long range;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Customer ID:");
		customerId=s.nextInt();
		System.out.println("Enter the Customer Phone No:");
		phone=s.nextInt();
		System.out.println("Enter the ID:");
		id=s.nextByte();
		System.out.println("Enter the Salary");
		salary=s.nextShort();
		System.out.println("Enter your range");
		range=s.nextLong();
		System.out.println("Enter the customer name");
		s.nextLine();
		String name = s.nextLine();
		System.out.println(name);
		System.out.println(phone);
		System.out.println(customerId);
		System.out.println(id);
		System.out.println(salary);
		System.out.println(range);
	}
}
