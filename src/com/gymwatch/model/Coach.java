package com.gymwatch.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name="COACH")
public class Coach extends Person{
	@Column
	private String info;
	@ManyToOne
	@JoinColumn(name="GYM_ID")
	private Gym gym;
	@OneToMany (mappedBy="coach")
	private Collection<Client> clients;
	public Coach(){
		
	}
	public Coach(String name, String phone,String info, Gym gym) {
		super(name, phone);
		this.info=info;
		this.gym=gym;
		clients=new ArrayList<Client>();
	}
	public void addClient(Client client){
		clients.add(client);
	}
	
	public void removeClient(Client client){
		clients.remove(client);
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Collection<Client> getClients() {
		return clients;
	}
	public void setClients(ArrayList<Client> clients) {
		deleteClientList();
		this.clients = clients;
		
	}

	public void deleteClientList(){
		clients.clear();
	}
	public Gym getGym() {
		return gym;
	}
	public void setGym(Gym gym) {
		this.gym = gym;
	}
	



}
