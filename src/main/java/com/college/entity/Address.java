package com.college.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data

public class Address {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long addressId;
	private String addressStreet;
	private String addressState;
	
	 
	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	public String getAddressStreet() {
		return addressStreet;
	}

	public void setAddressStreet(String addressStreet) {
		this.addressStreet = addressStreet;
	}

	public String getAddressState() {
		return addressState;
	}

	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}
 

	public Address(long addressId, String addressStreet, String addressState) {
		super();
		this.addressId = addressId;
		this.addressStreet = addressStreet;
		this.addressState = addressState;
 	}

	public Address() {
		super();
	}
	
	
	
	
}
