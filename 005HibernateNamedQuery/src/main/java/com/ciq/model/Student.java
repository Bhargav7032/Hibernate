package com.ciq.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
@NamedQueries(value = { @NamedQuery(name = "findAll",query = "from Student"),
		 @NamedQuery(name = "findbysname",query = "from Student where sname= :sname"),
		 @NamedQuery(name = "deletebysname",query = "Delete Student where sname= :sname"),
		 @NamedQuery(name = "updatebysfee",query = "Update Student set sfee= :sfee"),})

public class Student {
	@Id
	@Column
	private int sid;
	@Column
	private String sname ;
	@Column
	private double sfee;
	
	public Student() {
		
	}
	public Student(int sid, String sname, double sfee) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfee = sfee;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getSfee() {
		return sfee;
	}
	public void setSfee(double sfee) {
		this.sfee = sfee;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + "]";
	}

	
}
