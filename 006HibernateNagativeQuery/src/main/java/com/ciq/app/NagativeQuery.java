package com.ciq.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import com.ciq.model.Student;
import com.ciq.util.SessionUtil;

public class NagativeQuery {
	public static void main(String[] args) {
		 Session session=SessionUtil.getSession();
	
		 
		 NativeQuery query =session.createNativeQuery("Select * from Student", Student.class);
		 List<Student>students=query.list();
		 for(Student student:students) {
			 System.out.println(student);
		 }
		 
		session.close();
	}

}
