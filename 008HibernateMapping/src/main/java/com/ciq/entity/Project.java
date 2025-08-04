package com.ciq.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Project {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)

	private int pid;
	private String pname;
	private List<Employee> employees;
}
