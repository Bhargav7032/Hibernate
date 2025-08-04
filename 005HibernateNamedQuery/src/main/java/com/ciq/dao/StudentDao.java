package com.ciq.dao;

import java.util.List;

import com.ciq.model.Student;

public interface StudentDao {
	
	public void save(Student student);
	
	public void update(Student student);
	
	public Student findByid(int sid);
	
	public void delete(int sid);
	
	public List<Student>findAll();

}
