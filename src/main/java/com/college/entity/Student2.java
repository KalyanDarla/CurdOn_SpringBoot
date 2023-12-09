package com.college.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Student2 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String studentName;

@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)

@JoinTable(name = "Student2_department", joinColumns = { @JoinColumn(name = "student2_id") }, inverseJoinColumns = {
		@JoinColumn(name = "department_id") })
private List<Department> department;

public Student2(String studentName, List<Department> department) {
	super();
	this.studentName = studentName;
	this.department = department;
}

public Student2() {
	super();
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getStudentName() {
	return studentName;
}

public void setStudentName(String studentName) {
	this.studentName = studentName;
}

public List<Department> getDepartment() {
	return department;
}

public void setDepartment(List<Department> department) {
	this.department = department;
}






}
