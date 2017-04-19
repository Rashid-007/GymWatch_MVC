package com.gymwatch.model;

import java.util.Date;

import javax.persistence.*;
@Entity
@Table(name="SUBSCRIPTION")
public class Subscription {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(name="START_DATE")
	private Date startDate;
	@Column(name="END_DATE")
	private Date endDate;
	@Column(name="NUM_MONTHS")
	private int numberOfMonths;
	@Column
	private double price;
	@ManyToOne
	@JoinColumn(name="SUB_TYPE_ID")
	private SubType subs_type;
	@ManyToOne
	@JoinColumn(name="Client_ID")
	private Client client;
	@ManyToOne
	@JoinColumn(name="GYM_ID")
	private Gym gym;

	public Subscription(){
		
	}
	public Subscription(Date startDate, Date endDate, int numberOfMonths, double price,
			SubType subs_type, Client client, Gym gym) {
		this.startDate = startDate;
		this.endDate = endDate;
		this.numberOfMonths = numberOfMonths;
		this.price = price;
		//this.subs_type = subs_type;
		this.client = client;
		this.gym = gym;
	}
	

public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	public int getNumberOfMonths() {
		return numberOfMonths;
	}


	public void setNumberOfMonths(int numberOfMonths) {
		this.numberOfMonths = numberOfMonths;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


/*	public SubType getSubs_type() {
		return subs_type;
	}


	public void setSubs_type(SubType subs_type) {
		this.subs_type = subs_type;
	}*/


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public Gym getGym() {
		return gym;
	}


	public void setGym(Gym gym) {
		this.gym = gym;
	}


	// boolean check of subsbription of based on crrent date
	//prolongation of subscription
	public boolean checkValidity(){
		/*returns true if subscription is valid based on endDate */
		return new Date().after(endDate);
	}
	public void extendSubscription(){
		endDate=new Date();
	}


	@Override
	public String toString() {
		return "Subscription [id=" + id + ", startDate=" + startDate + ", endDate=" + endDate + ", numberOfMonths="
				+ numberOfMonths + ", price=" + price + ", subs_type=" + "]";
	}


	public SubType getSubs_type() {
		return subs_type;
	}


	public void setSubs_type(SubType subs_type) {
		this.subs_type = subs_type;
	}
	

}
