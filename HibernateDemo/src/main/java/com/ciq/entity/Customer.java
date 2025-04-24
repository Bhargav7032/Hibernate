package com.ciq.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Customer_tab")
public class Customer {
	@Id
	@Column(name = "C_ID")
	private int cid;
	
	@Column(name = "C_NAME")
	private String name;
	
	@Column(name = "C_CAST")
	private double cast;
	
	@Column(name = "C_Type")
	private String type;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int cid, String name, double cast, String type) {
		super();
		this.cid = cid;
		this.name = name;
		this.cast = cast;
		this.type = type;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCast() {
		return cast;
	}

	public void setCast(double cast) {
		this.cast = cast;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", cast=" + cast + ", type=" + type + "]";
	}
	
	
	
}
