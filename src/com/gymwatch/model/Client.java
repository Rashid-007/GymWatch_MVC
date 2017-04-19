package com.gymwatch.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="CLIENT")
public class Client extends Person {
	@Column
	private String email;
	@Column(name="BIRTH_DATE")
	private Date birthDate;
	@Column
	private String gender;
	@OneToMany (mappedBy="client")
	private Collection<Subscription> subscriptions;
	@ManyToOne
	@JoinColumn(name="COACH_ID")
	private Coach coach;
	@ManyToOne
	@JoinColumn(name="GYM_ID")
	private Gym gym;
	public Client(){
	}
	public Client(String name, String phone, String gender,  String email, Date birthDate) {
		super(name, phone);
		this.gender=gender;
		this.email=email;
		this.birthDate=birthDate;
		subscriptions=new ArrayList<Subscription>();
	}
	public void addSubscription(Subscription subscription){
		subscriptions.add(subscription);
	}
	public void removeSubscription(Subscription subscription){
		subscriptions.remove(subscription);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Collection<Subscription> getSubscriptions() {
		return subscriptions;
	}

	public void setSubscriptions(ArrayList<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}

	@Override
	public String toString() {
		return "Client [email=" + email + ", birthDate=" + birthDate + ", gender=" + gender + ", subscriptions="
				+ subscriptions + "]";
	}
	public Coach getCoach() {
		return coach;
	}
	public void setCoach(Coach coach) {
		this.coach = coach;
	}
	public Gym getGym() {
		return gym;
	}
	public void setGym(Gym gym) {
		this.gym = gym;
	}
	public void setSubscriptions(Collection<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}
	/*@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String getPhone() {
		return phone;
	}
	@Override
	public void setPhone(String phone) {
		this.phone = phone;
	}
	*/

	
	
	

}
