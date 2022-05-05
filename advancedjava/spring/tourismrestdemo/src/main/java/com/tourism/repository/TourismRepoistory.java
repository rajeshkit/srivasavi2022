package com.tourism.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.tourism.model.Tourism;
@Repository
public class TourismRepoistory {
	public Tourism createToursim(Tourism t) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Tourism.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(t);
		session.getTransaction().commit();
		session.close();
		sf.close();
		return t;
	}

	public List<Tourism> getAllTourism() {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Tourism.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Query q=session.createQuery("from Tourism");
		List<Tourism> listOfTourism=q.getResultList();
		session.getTransaction().commit();
		session.close();
		sf.close();
		return listOfTourism;
	}

	public Tourism getTourismByTourId(int tId) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Tourism.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Tourism tour = session.get(Tourism.class,tId);
		session.getTransaction().commit();
		session.close();
		sf.close();
		
		return tour;
	}

	public void deleteTourismByTourId(int tId) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Tourism.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Tourism tour = session.get(Tourism.class,tId);
		session.delete(tour);
		session.getTransaction().commit();
		session.close();
		sf.close();
		
	}
}	
