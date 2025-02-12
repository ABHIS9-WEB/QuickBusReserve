package com.busreservation.dto;

import lombok.Data;

@Data
public class JourneySeatDetailsResponse extends CommonApiResponse {

	private int totalSeat;

	private int backSeats;

	private int middleSeats;

	private int frontSeats;

	private int backSeatsAvailable;

	private int middleSeatsAvailable;

	private int frontSeatsAvailable;
	
	private int backSeatsWaiting;

	private int middleSeatsWaiting;

	private int frontSeatsWaiting;

	public void setFrontSeatsAvailable(int size) {
		// TODO Auto-generated method stub
		
	}

	public void setMiddleSeatsAvailable(int size) {
		// TODO Auto-generated method stub
		
	}

	public void setBackSeatsAvailable(int size) {
		// TODO Auto-generated method stub
		
	}

	public void setBackSeatsWaiting(int size) {
		// TODO Auto-generated method stub
		
	}

	public void setMiddleSeatsWaiting(int size) {
		// TODO Auto-generated method stub
		
	}

	public void setFrontSeatsWaiting(int size) {
		// TODO Auto-generated method stub
		
	}

}
