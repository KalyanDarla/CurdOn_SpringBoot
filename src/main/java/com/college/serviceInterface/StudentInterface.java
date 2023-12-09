package com.college.serviceInterface;

import java.util.List;

import com.college.entity.Student;
import com.college.entity.Student2;
import com.college.util.StudentUtil;

public interface StudentInterface {

	public Student saveStudent(Student stuent);

	public Student2 saveStudent2(Student2 student2);

	public Student updateStudent(Student student, long id);

	public List<Student> getAllStudents();

	public String deleteStudent(long id);
	
	public Student findById(long id);
	
	public Student findbyName(String name);
	
	public StudentUtil findByMiddleName(String middleName);

}
