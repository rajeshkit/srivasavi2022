package revature.hibernatedemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Customer c=new Customer();
    	c.setAccountNo(100);
    	c.setEmail("rajesh.kit@gmail.com");
    	c.setName("Rajesh");
    	c.setPhone("9999999");
    	
    	Loan l1=new Loan();
    	l1.setLoanId(2000);
    	l1.setLoanName("Personal Loan");
    	l1.setLoanAmount(100000);
     	
    	Loan l2=new Loan();
    	l2.setLoanId(3000);
    	l2.setLoanName("Car Loan");
    	l2.setLoanAmount(200000);
    	
    
    	Customer c2=new Customer();
    	c2.setAccountNo(200);
    	c2.setEmail("kannan.kit@gmail.com");
    	c2.setName("kannan");
    	c2.setPhone("8888888");
    	
    	Loan l3=new Loan();
    	l3.setLoanId(4000);
    	l3.setLoanName("Home Loan");
    	l3.setLoanAmount(500000);
    
    	
    	Loan l4=new Loan();
    	l4.setLoanId(5000);
    	l4.setLoanName("Car Loan");
    	l4.setLoanAmount(500000);
    	
    	List<Loan> list=new ArrayList<Loan>();
    	list.add(l1);
    	list.add(l2);
    	list.add(l3);
    	
    	c.setLoan(list);
    	
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
    	s.save(l3);
    	//s.save(l4);
    	s.getTransaction().commit();
    	s.close();
    	sf.close();
    	
	}
}
