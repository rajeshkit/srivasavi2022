package springdisetterjavaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Customer {
	private Loan loan;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(Loan loan) {
		super();
		this.loan = loan;
	}
	void displayLoan() {
		loan.getLoanDetails(2034);
	}
	public static void main(String[] args) {
		ApplicationContext ac=
		new AnnotationConfigApplicationContext(JavaBasedAcConfiguration.class);
		Customer c=ac.getBean("c",Customer.class);
		c.displayLoan();
	}
}
