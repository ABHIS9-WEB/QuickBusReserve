package com.busreservation.dto;

import lombok.Data;

@Data
public class JourneyUpdateStatusRequestDto {
	
	private int journeyId;
	
	private String status;

	public int getJourneyId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getStatus() {
		// TODO Auto-generated method stub
		return null;
	}

}
