package com.ciq.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.ciq.entity.Customer;

public class Hibernatecontroller {

	public static void main(String[] args) {
		
		 StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
	                .configure("hibernate.cfg.xml") // loads hibernate.cfg.xml
	                .build();

	        Metadata metadata = new MetadataSources(registry)
	                .addAnnotatedClass(Customer.class)
	                .getMetadataBuilder()
	                .build();

	      SessionFactory  sessionFactory = metadata.getSessionFactoryBuilder().build();
		
	      
	      Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		//Customer customer=new Customer(101, "BhargavRam", 3000.00, "Bike");
		
		      /* save */
		//session.persist(customer);   
	
		      /* Update */
		//session.merge(customer);
		
		 /* Delete */
//		session.remove(customer);
		
		 /* findById */
//		System.out.println(session.get(Customer.class, 101));
		
		/* findAll */
	System.out.println(session.createQuery("from Customer").list());

		
		transaction.commit();
		
		session.close();
	}
}
