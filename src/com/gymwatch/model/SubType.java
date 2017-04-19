package com.gymwatch.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name="SUBS_TYPE")
public class SubType {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column
	private String name;
	@Column(name="PRICE_PER_MONTH")
	private double pricePerMonth;
	@Column
	private String details;
	public SubType(){
		
	}
	public SubType(String name, double pricePerMonth, String details) {
		this.name = name;
		this.pricePerMonth = pricePerMonth;
		this.details = details;
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
	public double getPricePerMonth() {
		return pricePerMonth;
	}
	public void setPricePerMonth(double pricePerMonth) {
		this.pricePerMonth = pricePerMonth;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
/*subscription was removed from here. was not required*/
	

}
