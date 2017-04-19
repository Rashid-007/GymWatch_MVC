package com.gymwatch.model;

import javax.persistence.*;

@Entity
public class User {
	@Id
	private int id;
	@Column
	private String username;
	@Column
	private String password;
	@Column
	private String user;
	
	public User(String username, String password, String user ){
		this.username=username;
		this.password=password;
		this.user=user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	

}
