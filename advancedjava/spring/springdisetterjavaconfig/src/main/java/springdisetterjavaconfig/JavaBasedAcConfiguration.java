package springdisetterjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaBasedAcConfiguration {
	@Bean(name = "l")
	public Loan getLoan() {
		return new Loan();
	}
	@Bean(name="c")
	public Customer getCustomer() {
		Customer cust=new Customer();
		cust.setLoan(getLoan());
		return cust; 
	}
}
