package com.ciq.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.ciq.model.Student;
import com.ciq.util.SessionUtil;

public class NamedQuery {
	public static void main(String[] args) {
		 Session session=SessionUtil.getSession();
		
		     
		   
		 
//		 Query query=session.createNamedQuery("findAll", Student.class);
//		 List<Student>students=query.getResultList();
//		 for (Student student : students) {
//			 System.out.println(student);
//		}
		 
		 
	Query query=session.createNamedQuery("findbysname",Student.class);
	query.setParameter("sname"," jai Ramm") ;
		List<Student>students=query.list(); 
		 for(Student student:students) {
			 System.out.println(student);
		 }
		 
		 
		session.close();
	}

}
