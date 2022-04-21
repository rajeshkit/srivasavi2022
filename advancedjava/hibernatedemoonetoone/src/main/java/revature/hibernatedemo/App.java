package revature.hibernatedemo;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	Loan l1=new Loan();
    	l1.setLoanId(2000);
    	l1.setLoanName("Personal Loan");
    	l1.setLoanAmount(100000);
    	
    	
    	Loan l2=new Loan();
    	l2.setLoanId(3000);
    	l2.setLoanName("Car Loan");
    	l2.setLoanAmount(200000);
    	
    	Customer c=new Customer();
    	c.setAccountNo(100);
    	c.setEmail("rajesh.kit@gmail.com");
    	c.setName("Rajesh");
    	c.setPhone("9999999");
    	c.setLoan(l1);
    	Customer c2=new Customer();
    	c2.setAccountNo(200);
    	c2.setEmail("kannan.kit@gmail.com");
    	c2.setName("kannan");
    	c2.setPhone("8888888");
    	c2.setLoan(l2);
    	
    	l1.setCustomer(c);
    	l2.setCustomer(c2);
    	SessionFactory sf=new Configuration()
    			.configure("hibernate.cfg.xml").addAnnotatedClass(Customer.class)
    			.addAnnotatedClass(Loan.class)
    			.buildSessionFactory();
    	Session s=sf.openSession();
    	s.beginTransaction();
    	s.save(c);
    	s.save(c2);
    	s.save(l1);
    	s.save(l2);
    	Loan l = s.get(Loan.class,2000);
    	System.out.println(l);
    	s.getTransaction().commit();
    	s.close();
    	sf.close();
    	
	}
}
