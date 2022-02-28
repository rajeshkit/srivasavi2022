import java.util.Scanner;

public class MainAirtel {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Phone no");
		int phone=s.nextInt();//7677
		System.out.println("Enter the Customer Name:");
		String name=s.nextLine();//rajesh
		System.out.println("Enter the Bill Amount:");
		int amount=s.nextInt();//445
		Customer c=new Customer();
		c.getBill(phone, name, amount);//7677,rajesh,445
		
		
		CustomerBill cb=new CustomerBill();
		cb.setCustomerName(name);
		cb.setAmount(amount);
		cb.setPhoneNo(phone);
		c.getBill(cb);//20202020
	}
}
