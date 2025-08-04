package com.ciq.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.hibernate.query.SelectionQuery;

import com.ciq.model.Student;
import com.ciq.util.SessionUtil;

public class HqlDemo {

	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		
		
		  //findAll Students//
		 		
//		Query query=session.createQuery("from Student",Student.class);
//		
//		List<Student>students=query.list();
//		for (Student student : students) {
//			System.out.println(student);
//		}
		
		//Update Student//
//		
//	Transaction transaction=session.beginTransaction();
//		Query<?> query=session.createQuery("Update Student set sfee= :sfee");
//		query.setParameter("sfee", 40000.00);
//		int result = query.executeUpdate();
//		transaction.commit();
//		System.out.println(result +"Rows Updated");
		
		
		//Delete Student//
		
//	Transaction transaction=session.beginTransaction();
//		Query<?> query=session.createQuery("Delete Student where sname= :sname");
//		query.setParameter("sname", "BhargavRam");
//		int result = query.executeUpdate();
//		transaction.commit();
//		System.out.println(result +"Rows Updated");
		
		
		
		  //SeletectionQuery//
 		
		SelectionQuery<Student> query=session.createSelectionQuery("from Student",Student.class);
		
		List<Student>students=query.list();
		for (Student student : students) {
			System.out.println(student);
		}

		
		SessionUtil.close(session);

	}

}
