package com.college.serviceImpl;

import org.springframework.stereotype.Service;

import com.college.entity.Address;
import com.college.repository.AddressRepository;
import com.college.serviceInterface.AddressInterface;


@Service
public class AddressImpl implements AddressInterface {
	
	 private AddressRepository addressRepository;

	@Override
	public Address saveAddress(Address address) {
		// TODO Auto-generated method stub
		addressRepository.save(address);
		return address;
	}

}
