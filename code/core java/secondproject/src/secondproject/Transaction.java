package secondproject;

import java.util.Scanner;

public class Transaction {
	int transactionId;
    static String name;
	public void display() {
		Transaction t2=new Transaction();
		System.out.println(transactionId);
		System.out.println(Transaction.name);
	}
	public static void show() {
		System.out.println(name);
		Transaction t=new Transaction();
		System.out.println(t.transactionId);
		t.display();
	}
	public static void main(String[] args) {
		Transaction.show();
		Scanner s=new Scanner(System.in);
		s.nextInt();
	}
	
	
	
	
	
	
	
}
