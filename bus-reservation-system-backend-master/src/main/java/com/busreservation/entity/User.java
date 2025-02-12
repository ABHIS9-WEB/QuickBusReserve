package com.busreservation.entity;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	private String email;

	@JsonIgnore
	private String password;

	private String roles;
	
	private String gender;

	private String contact;

	private String street;

	private String city;

	private String pincode;

	private BigDecimal walletAmount;
	
	private String status;

	public BigDecimal getWalletAmount() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getRoles() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setWalletAmount(BigDecimal subtract) {
		// TODO Auto-generated method stub
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setStatus(String value) {
		// TODO Auto-generated method stub
		
	}

	public void setPassword(String encodedPassword) {
		// TODO Auto-generated method stub
		
	}

	public void setEmail(String email2) {
		// TODO Auto-generated method stub
		
	}

	public void setRoles(String value) {
		// TODO Auto-generated method stub
		
	}

	public Object getStatus() {
		// TODO Auto-generated method stub
		return null;
	}

}
