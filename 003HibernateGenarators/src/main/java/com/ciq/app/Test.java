package com.ciq.app;

import java.util.List;

import com.ciq.dao.StudentDao;
import com.ciq.dao.StudentDaoImpl;
import com.ciq.entity.Student;

public class Test {

	public static void main(String[] args) {
		
		StudentDao studentDao=new StudentDaoImpl();
	  
//		Student student=new Student();
//		student.setSid(103);
//		student.setSname(" jai Ram");
//		student.setSfee(35000.00);
//		studentDao.save(student);
		
//		Student student=studentDao.findByid(101);
//	    System.out.println(student);

		
		//studentDao.delete(101);
		
	//	studentDao.update(student);
		
		List<Student>students=studentDao.findAll();
		for (Student student : students) {
			System.out.println(student);
		}
	}
}
