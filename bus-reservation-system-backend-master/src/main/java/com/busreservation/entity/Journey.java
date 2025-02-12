package com.busreservation.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Entity
@ToString
@Getter
@Setter
public class Journey {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String journeyNumber;
	
	private String departureTime;
	
	private String arrivalTime;
	
	private String status; // Scheduled, On Time, Delayed, etc.

	@ManyToOne
	@JoinColumn(name = "departure_busstop_id")
	private BusStop departureBusStop;

	@ManyToOne
	@JoinColumn(name = "arrival_busstop_id")
	private BusStop arrivalBusStop;

	@ManyToOne
	@JoinColumn(name = "bus_id")
	private Bus bus;
	
	private BigDecimal backSeatFare;
	
	private BigDecimal middleSeatFare;
	
	private BigDecimal frontSeatFare;
	
	
	// from Bus Entity
    private int totalSeat;
    
    private int backSeats;
	
    private int middleSeats;
    
    private int frontSeats;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJourneyNumber() {
		return journeyNumber;
	}

	public void setJourneyNumber(String journeyNumber) {
		this.journeyNumber = journeyNumber;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BusStop getDepartureBusStop() {
		return departureBusStop;
	}

	public void setDepartureBusStop(BusStop departureBusStop) {
		this.departureBusStop = departureBusStop;
	}

	public BusStop getArrivalBusStop() {
		return arrivalBusStop;
	}

	public void setArrivalBusStop(BusStop arrivalBusStop) {
		this.arrivalBusStop = arrivalBusStop;
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	public BigDecimal getBackSeatFare() {
		return backSeatFare;
	}

	public void setBackSeatFare(BigDecimal backSeatFare) {
		this.backSeatFare = backSeatFare;
	}

	public BigDecimal getMiddleSeatFare() {
		return middleSeatFare;
	}

	public void setMiddleSeatFare(BigDecimal middleSeatFare) {
		this.middleSeatFare = middleSeatFare;
	}

	public BigDecimal getFrontSeatFare() {
		return frontSeatFare;
	}

	public void setFrontSeatFare(BigDecimal frontSeatFare) {
		this.frontSeatFare = frontSeatFare;
	}

	public int getTotalSeat() {
		return totalSeat;
	}

	public void setTotalSeat(int totalSeat) {
		this.totalSeat = totalSeat;
	}

	public int getBackSeats() {
		return backSeats;
	}

	public void setBackSeats(int backSeats) {
		this.backSeats = backSeats;
	}

	public int getMiddleSeats() {
		return middleSeats;
	}

	public void setMiddleSeats(int middleSeats) {
		this.middleSeats = middleSeats;
	}

	public int getFrontSeats() {
		return frontSeats;
	}

	public void setFrontSeats(int frontSeats) {
		this.frontSeats = frontSeats;
	}
}
