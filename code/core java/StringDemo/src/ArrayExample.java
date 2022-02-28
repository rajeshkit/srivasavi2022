import java.util.Scanner;

public class ArrayExample {
	public static void main(String[] args) {
		int a;
		int[] subjects=new int[] {56,24,78,35,89,24,78,434,89,57};  //10
		String[] days=new String[] {"Sunday","Monday","Tuesday"};
		
		String[] day=new String[10];
		Scanner s=new Scanner(System.in);
	
		Employee e1=new Employee(3435,"abc","abc@gmail.com",3445.4f);
		Employee e2=new Employee(6767,"bcd","bcd@gmail.com",4455.4f);
		Employee e3=new Employee(8788,"rfd","rfd@gmail.com",67677.4f);
		
		Employee[] emp=new Employee[] {e1,e2,e3};
		
//		for(int i=0;i<10;i++) {
//			subjects[i]=s.nextInt();
//		}
//		System.out.println(subjects[9]);
//		for(int i=0;i<10;i++) {
//			System.out.println(subjects[i]);
//		}
		s.close();
		
	
	}
}
