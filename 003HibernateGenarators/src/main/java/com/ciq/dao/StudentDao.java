package com.ciq.dao;

import java.util.List;

import com.ciq.entity.Student;

public interface StudentDao {
	
	public void save(Student student);
	
	public void update(Student student);
	
	public List<Student>findAll();
	
	public void DeleteById(int sid);
	
	public Student FindById(int sid);
	
	

}
