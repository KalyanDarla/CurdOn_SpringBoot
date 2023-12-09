package com.college.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.entity.Student;
import com.college.entity.Student2;
import com.college.exception.ResourceNotFoundException;
import com.college.repository.Student2Repository;
import com.college.repository.StudentRepository;
import com.college.serviceInterface.StudentInterface;
import com.college.util.StudentUtil;

@Service
public class StudentImpl implements StudentInterface {

	@Autowired
	private StudentRepository StudentRepository;

	@Autowired
	private Student2Repository StudentRepository2;

	@Override
	public Student saveStudent(Student stuent) {
		// TODO Auto-generated method stub

		StudentRepository.save(stuent);
		return stuent;
	}

	@Override
	public Student2 saveStudent2(Student2 student2) {
		// TODO Auto-generated method stub
		StudentRepository2.save(student2);
		return student2;
	}

	@Override
	public Student updateStudent(Student student, long id) {
		// TODO Auto-generated method stub
		Student oldStudent = StudentRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Id Type Not Found "));

		oldStudent.setFirstName(student.getFirstName());
		oldStudent.setMiddleName(student.getMiddleName());
		oldStudent.setLastName(student.getLastName());
		StudentRepository.save(oldStudent);
		return oldStudent;
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> student = StudentRepository.findAll();
		return student;
	}

	@Override
	public String deleteStudent(long id) {
		// TODO Auto-generated method stub

		StudentRepository.deleteById(id);
		return "Delete Student Success";
	}

	@Override
	public Student findById(long id) {
		// TODO Auto-generated method stub
		return StudentRepository.findById(id).get();
	}

	@Override
	public Student findbyName(String name) {
		// TODO Auto-generated method stub
		Student student = StudentRepository.findByFirstName(name);
		return student;
	}

	@Override
	public StudentUtil findByMiddleName(String middleName) {
		// TODO Auto-generated method stub
		StudentUtil studentUtil = StudentRepository.findByMiddleName(middleName);
		return studentUtil;
	}

}
