package com.dp.model;

import java.util.Scanner;

public class Seller {
	public static void main(String[] args) {
		Laptop lenova=new Laptop();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Laptop Id:");
		lenova.setLaptopId(s.nextInt());
		s.nextLine();
		System.out.println("Enter the Laptop Model:");
		lenova.setModelName(s.nextLine());
		System.out.println("Enter the model no:");
		lenova.setModel(s.next());
		System.out.println("Enter the laptop price:");
		lenova.setCost(s.nextFloat());
		System.out.println(lenova.getLaptopId()+" "+lenova.getModelName()+"  "+lenova.getCost());
		Buyer b=new Buyer();
		b.buyLaptop(lenova);
		
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the Laptop Id:");
		int id=s1.nextInt();
		s1.nextLine();
		System.out.println("Enter the Laptop Model:");
		String name=s1.nextLine();
		System.out.println("Enter the model no:");
		String model = s1.next();
		System.out.println("Enter the laptop price:");
		float p = s1.nextFloat();
		Buyer b1=new Buyer();
		b1.buyLaptop(id, name, model, p);
	
	}
}
