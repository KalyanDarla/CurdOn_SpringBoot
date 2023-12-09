package com.college.entity;

 
import jakarta.persistence.Entity;
 import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id; 

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String departmentName;
 

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

 

	public Department(String departmentName) {
		super();
 		this.departmentName = departmentName;
 	}

	public Department() {
		super();
	}
	
	
	

}
