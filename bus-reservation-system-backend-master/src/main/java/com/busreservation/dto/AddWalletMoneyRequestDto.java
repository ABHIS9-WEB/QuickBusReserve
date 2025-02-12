package com.busreservation.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class AddWalletMoneyRequestDto {
	
	private int userId;
	
	private double  walletAmount;

	public int getUserId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getWalletAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
