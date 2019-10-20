/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infosys.irs.model;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.infosys.irs.entity.FlightEntity;
import com.infosys.irs.utility.CalendarUtility;

public class Flight {
	
	@NotEmpty(message="Please enter the id")
	@NotNull(message="Id is mandatory")
	private String flightId;
	@NotEmpty(message = "Password must not be blank.")
	@Size(min = 3, max = 15, message = "Airlines name must be between 5 to 15 Characters.")
	private String airlines;
	@NotEmpty(message="Please enter the origin")
	@NotNull(message="Soource is mandatory")
	private String source;
	@NotEmpty(message="Please enter the destination")
	 @NotNull(message="Destination is mandatory")
	private String destination;
	private String fare;
	@NotEmpty(message="Please enter the Flight available date")
	 @NotNull(message="Flight available date is mandatory")
	@Pattern(regexp = "(([1-2][0-9])|([1-9])|(3[0-1]))[-]((1[0-2])|([1-9]))[-][0-9]{4}", message ="Fuck you")
	private String flightAvailableDate;
	private String departureTime;
	private String arrivalTime;
	@Digits(fraction = 0, integer = 2, message="Bc Int Dal")
	private String seatCount;

	

	public String getFlightAvailableDate() {
		return flightAvailableDate;
	}
	
	public void setFlightAvailableDate(String flightAvailableDate) {
		this.flightAvailableDate = flightAvailableDate;
	}

	public String getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(String seatCount) {
		this.seatCount = seatCount;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public void setFare(String fare) {
		this.fare = fare;
	}

	public String getSource() {
		return source;
	}

	public String getDestination() {
		return destination;
	}

	public String getFare() {
		return fare;
	}
	

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	/**
	 * @return the flightId
	 */
	public String getFlightId() {
		return flightId;
	}

	/**
	 * @param flightId
	 *            the flightId to set
	 */
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public String getAirlines() {
		return airlines;
	}

	public void setAirlines(String airlines) {
		this.airlines = airlines;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
	public FlightEntity toEntity() throws Exception {
		FlightEntity flight = new FlightEntity();
		flight.setAirlines(this.airlines);
		flight.setArrivalTime(this.arrivalTime);
		flight.setDepartureTime(this.departureTime);
		flight.setDestination(this.destination);
		flight.setFare(Double.valueOf(this.fare));
		flight.setFlightAvailableDate(CalendarUtility.getCalendarFromString(this.flightAvailableDate));
		flight.setFlightId(this.flightId);
		flight.setSeatCount(Integer.valueOf(this.seatCount));
		flight.setSource(this.source);
		flight.setSource(this.source);
		return flight;
	}
	
}
