package com.ciq.dao;

import java.util.List;

import org.hibernate.Session;

import com.ciq.model.Student;
import com.ciq.util.SessionUtil;

public class StudentDaoImpl implements StudentDao {

	@Override
	public void save(Student student) {
		Session session=SessionUtil.getSession();
		session.persist(student);
		session.beginTransaction().commit();
		
	}

	@Override
	public void update(Student student) {
		Session session=SessionUtil.getSession();
		session.merge(student);
		session.beginTransaction().commit();
		
	}

	@Override
	public Student findByid(int sid) {
		return SessionUtil.getSession().get(Student.class, sid);
	}

	@Override
	public void delete(int sid) {
		Student student =new Student();
		student.setSid(sid);
		Session session =SessionUtil.getSession();
		session.remove(student);
		session.beginTransaction().commit();
	}

	@Override
	public List<Student> findAll() {
	return SessionUtil.getSession().createQuery("from Student", Student.class).list();

	}
	 
}
