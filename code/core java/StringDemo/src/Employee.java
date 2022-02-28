
public class Employee {
	int id;
	String name;
	float salary;
	String email;
	public Employee() {
		System.out.println("employee constructor");
	}
	public Employee(int id,String name,String email,float salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.email=email;
	}
	
	public static void main(String[] args) {
		
		Employee e1=new Employee(3435,"abc","abc@gmail.com",3445.4f);
		Employee e2=new Employee(6767,"bcd","bcd@gmail.com",4455.4f);
		Employee e3=new Employee(8788,"rfd","rfd@gmail.com",67677.4f);
		
		
	}
}
