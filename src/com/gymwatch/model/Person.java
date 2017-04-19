package com.gymwatch.model;

import javax.persistence.Column;
import javax.persistence.*;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Person {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	protected int id;
	@Column
	protected String name;
	@Column
	protected String phone;
	public Person(){
		
	}
	public Person(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}








}
