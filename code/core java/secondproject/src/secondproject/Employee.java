package secondproject;

public class Employee {
	int employeeId; // instance
	String employeeName;// instance
	String employeeEmail;// instance
	static float employeeSalary;// instance
	public void work() {// instance
		System.out.println("Work is happening");
		System.out.println(employeeId);
	}
	public static void deposit() {// instance
		System.out.println("deposit is happening");
		Employee e1=new Employee();
		System.out.println(e1.employeeId);
	}
	public void withdrawl() {// instance
		System.out.println("withdrawl is happening");
		System.out.println(employeeId);
	}
	public static void main(String[] args) {// static
		Employee e=new Employee();
		System.out.println(e.employeeId);
	
		
	}
}
