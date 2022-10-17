package com.airline.dao;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="FlightDetails")

public class Flight {
	@Id
	
	private BigInteger flightNo;
	private String source;
	private String destinatin;
	private String arrival_time;
	private String departure_time;
	private String flight_duration;
	public BigInteger getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(BigInteger flightNo) {
		this.flightNo = flightNo;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestinatin() {
		return destinatin;
	}
	public void setDestinatin(String destinatin) {
		this.destinatin = destinatin;
	}
	public String getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}
	public String getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}
	public String getFlight_duration() {
		return flight_duration;
	}
	public void setFlight_duration(String flight_duration) {
		this.flight_duration = flight_duration;
	}
	
	

}
