package com.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.college.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
