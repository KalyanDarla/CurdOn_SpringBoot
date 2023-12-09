package com.college.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.entity.Address;
import com.college.serviceInterface.AddressInterface;
 
@RestController
@RequestMapping("/address")
public class AddressController {

	
	

	@Autowired
	private AddressInterface addressInterface;
	
	@PostMapping("/saveAddress")
	public ResponseEntity<Address>saveAddress(@RequestBody Address address){
		return new ResponseEntity(addressInterface.saveAddress(address),HttpStatus.CREATED);
		
	}
}
