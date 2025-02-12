package com.busreservation.dto;

import java.util.ArrayList;
import java.util.List;

import com.busreservation.entity.BusStop;

import lombok.Data;

@Data
public class BusStopResponseDto extends CommonApiResponse {

	private List<BusStop> busStops = new ArrayList<>();

	public void setBusStops(List<BusStop> busStops2) {
		// TODO Auto-generated method stub
		
	}
	
}
