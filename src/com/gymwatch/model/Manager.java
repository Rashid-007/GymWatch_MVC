package com.gymwatch.model;

import javax.persistence.*;

@Entity
@Table(name="MANAGER")
public class Manager extends Person{
	@Column
	private String info;
	@OneToOne
	@JoinColumn(name="GYM_ID")
	private Gym gym;
	
	public Manager(){
		
	}
	public Manager(String name, String phone, String info, Gym gym) {
		super(name, phone);
		this.info = info;
		this.gym = gym;
	}




	public String getInfo() {
		return info;
	}


	public void setInfo(String info) {
		this.info = info;
	}


	public Gym getGym() {
		return gym;
	}


	public void setGym(Gym gym) {
		this.gym = gym;
	}

}
