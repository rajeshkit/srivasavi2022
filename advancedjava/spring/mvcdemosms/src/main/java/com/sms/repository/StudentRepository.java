package com.sms.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.sms.model.Student;

@Repository
public class StudentRepository {
	public int registerStudent(Student s) {
		// hibernate to persist student object s

		System.out.println(s.getStudentName());
		System.out.println(s.getStudentPassword());
		System.out.println(s.getStudentEmail());
		System.out.println(s.getStudentPhone());
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Student.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
		session.close();
		sf.close();
		return 1;
	}

	public List<Student> getAllStudents() {
		// hibernate code to get all students as a list
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Student.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		Query q=session.createQuery("from Student");
		List<Student> listOfStudents=q.getResultList();
		
		session.getTransaction().commit();
		session.close();
		sf.close();
		return listOfStudents;
	}
	public void deleteStudentById(int sId) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Student.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Student s=session.get(Student.class, sId);
		session.delete(s);
		session.getTransaction().commit();
		session.close();
		sf.close();
	}
}
