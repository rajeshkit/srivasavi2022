package revature.hibernatedemo;

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
    	l1.setCustomer(c);
    	SessionFactory sf=new Configuration()
    			.configure("hibernate.cfg.xml").addAnnotatedClass(Customer.class)
    			.addAnnotatedClass(Loan.class)
    			.buildSessionFactory();
    	Session s=sf.openSession();
    	s.beginTransaction();
    	s.save(c);
    	s.save(l1);
    	s.getTransaction().commit();
    	s.close();
    	sf.close();
    	
	}
}
