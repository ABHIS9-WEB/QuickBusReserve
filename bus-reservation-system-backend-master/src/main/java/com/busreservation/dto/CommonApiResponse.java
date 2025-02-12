package com.busreservation.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonApiResponse {

	private String responseMessage;
	
	private boolean isSuccess;

	public void setResponseMessage(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setSuccess(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
