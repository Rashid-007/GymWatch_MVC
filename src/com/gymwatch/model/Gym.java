package com.gymwatch.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;
@Entity
@Table(name="GYM")
public class Gym {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column
	private String name;
	@Column
	private String address;
	@OneToOne
	@JoinColumn(name="MANAGER_ID")
	private Manager manager;
	@OneToMany (mappedBy="gym")
	private Collection<Client> clients;
	@OneToMany (mappedBy="gym")
	private Collection<Coach> coaches;
	@OneToMany (mappedBy="gym")
	private Collection<Subscription> subscriptions;
	//list of subscription
	public Gym(){
		
	}

	public Gym(String name, String address) {
		this.name = name;
		this.address = address;
		clients=new ArrayList<>();
		coaches=new ArrayList<>();
		subscriptions=new ArrayList<>();
		
		//
	}
	/*search client based on email or id*/
/*	public Client searchClient(int id){
		for(Client client: clients){
			if (client.getId()==id)
			return client;
		}
		
		return null;
	}*/
	public void addClient(Client client){
		clients.add(client);
	}
	public void removeClient(Client client){
		clients.remove(client);
	}
	public void addCoach(Coach coach){
		coaches.add(coach);
	}
	public void removeCoach(Coach coach){
		coaches.remove(coach);
	}
	public void addSubscription(Subscription subscription){
		subscriptions.add(subscription);
	}
	public void removeSubscription(Subscription subscription){
		subscriptions.remove(subscription);
	}
	public Client searchClient(String email){
		for(Client client: clients){
			if (client.getEmail()==email)
			return client;
		}
		
		return null;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public Collection<Client> getClients() {
		return clients;
	}

	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}

	public Collection<Coach> getCoaches() {
		return coaches;
	}

	public void setCoaches(ArrayList<Coach> coaches) {
		this.coaches = coaches;
	}

	public void setSubscriptions(ArrayList<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}

	public Collection<Subscription> getSubscriptions(){
		return subscriptions;
		
	}
	//search for client based on id: i.e email. with retuurn of client obje
	//search for subscritipn allsubscription related to one clients to be returned.
	//
	//register: check for instructure whether he is there or the clients.
	//client not instruct adn vise versa
	//prolongation of subscription throught
	
	
	

	

}
