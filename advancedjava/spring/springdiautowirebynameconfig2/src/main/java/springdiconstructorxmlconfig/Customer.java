package springdiconstructorxmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Customer {
	
	private Loan l;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	
	void displayLoan() {
		
		l.getLoanDetails(2034);
	}
	public static void main(String[] args) {
		ApplicationContext ac=
				new ClassPathXmlApplicationContext("applicationcontextconfig.xml");
		Customer c=ac.getBean("c",Customer.class);
		c.displayLoan();
	}
	
}
