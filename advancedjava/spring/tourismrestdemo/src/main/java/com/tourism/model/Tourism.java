package com.tourism.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tourism {
	@Id
	private int tripId;
	private String placeName;
	private float ticketCost;
	private int noOfDays;
	public Tourism() {
		// TODO Auto-generated constructor stub
	}
	public Tourism(int tripId, String placeName, float ticketCost, int noOfDays) {
		super();
		this.tripId = tripId;
		this.placeName = placeName;
		this.ticketCost = ticketCost;
		this.noOfDays = noOfDays;
	}
	public int getTripId() {
		return tripId;
	}
	public void setTripId(int tripId) {
		this.tripId = tripId;
	}
	public String getPlaceName() {
		return placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	public float getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(float ticketCost) {
		this.ticketCost = ticketCost;
	}
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	
}
