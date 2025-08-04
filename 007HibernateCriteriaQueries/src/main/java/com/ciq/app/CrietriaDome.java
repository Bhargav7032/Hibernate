package com.ciq.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;

import com.ciq.model.Student;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class CrietriaDome {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		CriteriaBuilder criteriabuilder = session.getCriteriaBuilder();
		CriteriaQuery<Student> criteriaquery = criteriabuilder.createQuery(Student.class);
		Root<Student> root = criteriaquery.from(Student.class);
		
		//select * from Student//
	
		criteriaquery.select(root).orderBy(criteriabuilder.desc(root.get("sname")));
		
		
	}

}
