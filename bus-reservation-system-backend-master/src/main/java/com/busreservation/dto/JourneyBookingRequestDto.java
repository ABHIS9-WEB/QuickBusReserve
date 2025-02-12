package com.busreservation.dto;

import lombok.Data;

@Data
public class JourneyBookingRequestDto {
	
    private int totalPassengers;
    
    private String journeyClassType;
    
    private int passengerId;

    private int journeyId;

	public Object getJourneyClassType() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getTotalPassengers() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getJourneyId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getPassengerId() {
		// TODO Auto-generated method stub
		return 0;
	}

}
