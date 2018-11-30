package com.adidas.city.entity;

import java.util.Date;

import lombok.Data;

@Data
public class City {

	private Long id;

	private String source;

	private String destination;

	private Date arrival_Time;

	private Date deparcher_Time;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getArrival_Time() {
		return arrival_Time;
	}

	public void setArrival_Time(Date arrival_Time) {
		this.arrival_Time = arrival_Time;
	}

	public Date getDeparcher_Time() {
		return deparcher_Time;
	}

	public void setDeparcher_Time(Date deparcher_Time) {
		this.deparcher_Time = deparcher_Time;
	}

}
