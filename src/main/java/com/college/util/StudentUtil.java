package com.college.util;

import com.college.entity.Student;

public class StudentUtil {
	

	private String firstName;
	private String middleName;
	private String lastName;
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public StudentUtil(String firstName, String middleName, String lastName) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "StudentUtil [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + "]";
	}
	
	
	
	
	
	
	

}
