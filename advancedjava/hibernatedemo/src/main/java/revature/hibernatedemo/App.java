package revature.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration con=new Configuration();
    	con.configure("hibernate.cfg.xml");
    	con.addAnnotatedClass(Customer.class);
    	SessionFactory sf = con.buildSessionFactory();
    	Session s=sf.openSession();
    	Customer c=new Customer();
    	c.setAccountNo(2000);
    	c.setEmail("ajay@gmail.com");
    	c.setName("ajay");
    	c.setPhone("567567657");
    	s.beginTransaction();
    	s.save(c);
    	s.getTransaction().commit();
    	s.close();
      
    	
    	//insertCustomer();
    	// getCustomerByAccountNo();
    	
    	//updateCustomer();
    	//deleteCustomer();
    	
    	
    	
    	
    }

	private static void deleteCustomer() {
		Configuration con=new Configuration();
    	con.configure("hibernate.cfg.xml");
    	con.addAnnotatedClass(Customer.class);
    	SessionFactory sf = con.buildSessionFactory();
    	Session s=sf.openSession();
    	s.beginTransaction();
    	Customer c = s.get(Customer.class, 1234);
    	s.delete(c);
    	s.getTransaction().commit();
    	s.close();
    	sf.close();
	}

	private static void updateCustomer() {
		Configuration con=new Configuration();
    	con.configure("hibernate.cfg.xml");
    	con.addAnnotatedClass(Customer.class);
    	SessionFactory sf = con.buildSessionFactory();
    	Session s=sf.openSession();
    	s.beginTransaction();
    	Customer c=new Customer();
		c.setAccountNo(1234);
		c.setPhone("90898988");
		Customer cust = s.get(Customer.class, 1237);
		cust.setPhone("000000");
    	s.update(cust);
    	s.getTransaction().commit();
    	s.close();
    	sf.close();
	}

	private static void getCustomerByAccountNo() {
		Configuration con=new Configuration();
    	con.configure("hibernate.cfg.xml");
    	con.addAnnotatedClass(Customer.class);
    	SessionFactory sf = con.buildSessionFactory();
    	Session s=sf.openSession();
    	s.beginTransaction();
    	Customer cust=s.get(Customer.class, 1236);
    	System.out.println(cust.getAccountNo()+" "+cust.getEmail());
    	System.out.println(cust.getName()+" "+cust.getPhone());
    	s.getTransaction().commit();
    	s.close();
    	sf.close();
	}

	private static void insertCustomer() {
		Configuration con=new Configuration();
		   con.configure("hibernate.cfg.xml");
		   con.addAnnotatedClass(Customer.class);
		   Customer c1=new Customer();
		   c1.setAccountNo(1236);
		   c1.setEmail("reshma.kit@gmail.com");
		   c1.setName("reshma");
		   c1.setPhone("7676767");
		   
		   Customer c2=new Customer();
		   c2.setAccountNo(1237);
		   c2.setEmail("karun.kit@gmail.com");
		   c2.setName("karun");
		   c2.setPhone("4546767");
		   
		   SessionFactory sf=con.buildSessionFactory();
		   Session s=sf.openSession();
		   s.beginTransaction();
		   s.save(c1);
		   s.save(c2);
		   s.getTransaction().commit();
		   s.close();
		   sf.close();
	}
}
