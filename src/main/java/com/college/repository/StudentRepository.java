package com.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.college.entity.Student;
import com.college.util.StudentUtil;

public interface StudentRepository extends JpaRepository<Student, Long> {

	
	
	public Student findByFirstName(String firstName);
	
	public StudentUtil findByMiddleName(String middleName);
}

