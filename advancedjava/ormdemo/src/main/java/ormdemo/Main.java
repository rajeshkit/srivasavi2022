package ormdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Student.class);
		config.addAnnotatedClass(College.class);
		SessionFactory sf=config.buildSessionFactory();
		Session session = sf.openSession();
		Student s=new Student();
		s.setStudentId(237);
		s.setStudentName("vijay");
		s.setStudentPhone("5473355");
		s.setStudentEmail("vijay@gmail.com");
		College c=new College();
		c.setId(128);
		c.setCollegeName("vasavi");
		c.setLocation("ap");
		session.beginTransaction();
		session.save(s);// drop the table and create a table 
		session.save(c);
		session.getTransaction().commit();
		session.close();
		sf.close();
	}
}
