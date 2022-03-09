package designpatterndemo;

public class Employee {
	private static Employee e=null;
	private Employee() {
		
	}
	public static Employee getInstance(){
		if(e!=null) {
			return e;
		}
		e=new Employee();
		return e;
	}
}
