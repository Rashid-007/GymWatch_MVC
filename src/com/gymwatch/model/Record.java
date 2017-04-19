package com.gymwatch.model;

import java.util.Date;

public class Record {
	private Date timeStamp;
	private Client client;
	private Gym gym;
	public Record(Date timeStamp, Client client, Gym gym) {
		super();
		this.timeStamp = timeStamp;
		this.client = client;
		this.gym = gym;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
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
	
	

}
