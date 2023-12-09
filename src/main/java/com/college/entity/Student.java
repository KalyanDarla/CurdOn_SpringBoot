package com.college.entity;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
 
@Entity
public class Student   {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studentId;
	private String firstName;
	private String middleName;
	private String lastName;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY,orphanRemoval = false)
	@JoinTable(name = "student_Address", joinColumns = { @JoinColumn(name = "student_id") }, inverseJoinColumns = {
			@JoinColumn(name = "address_id") })
	  // @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JsonIgnoreProperties({"hibernateLazyInitializer"})

	private Address address;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,orphanRemoval = false)
	@JoinTable(name = "Student_department", joinColumns = { @JoinColumn(name = "student_id") }, inverseJoinColumns = {
			@JoinColumn(name = "department_id") })
	  // @JsonIgnoreProperties({"pavan", "kalyan"})
	@JsonIgnoreProperties({"hibernateLazyInitializer"})

	private List<Department> department;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Department> getDepartment() {
		return department;
	}

	public void setDepartment(List<Department> department) {
		this.department = department;
	}

	public Student(String firstName, String middleName, String lastName, Address address, List<Department> department) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.address = address;
		this.department = department;
	}

	public Student() {
		super();
	}

}
