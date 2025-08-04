package com.ciq.studentest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.BeforeClass;
import org.junit.Test;

import com.ciq.dao.StudentDao;
import com.ciq.dao.StudentDaoImpl;
import com.ciq.model.Student;

public class StudentDaoTest {
	
public static StudentDao studentDao;

  @BeforeClass
  public static void setup() {
	  studentDao=new StudentDaoImpl();
  }

  @Test
  public void testcurd() {
	  Student student=new Student();
	  student.setSid(7);
	 student.setSname("vinodhini");
	 student.setSfee(20000.00);
	 studentDao.save(student);
	 
	
	 
//	 Student studentobj =studentDao.findByid(6);
//	 assertEquals("BhargavRam",studentobj.getSid() );
	 
	 
	 
	// Update
//	 student.setSname("BhargavRam");
//	 studentDao.update(student);
//	 studentobj = studentDao.findByid(6);
//	assertEquals("BhargavRam", studentobj.getSname());

			// Delete Test
//	   studentDao.delete(6);
//   	student = studentDao.findByid(6);
//			assertNull(student);
	 
  }
  
 
  
}
