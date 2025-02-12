package com.busreservation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class BusSeatNo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
    @JoinColumn(name = "bus_id")
    private Bus bus;
	
	private String seatNo;

	public void setBus(Bus addedBus) {
		// TODO Auto-generated method stub
		
	}

	public void setSeatNo(String seat) {
		// TODO Auto-generated method stub
		
	}

	public String getSeatNo() {
		// TODO Auto-generated method stub
		return null;
	}

}
