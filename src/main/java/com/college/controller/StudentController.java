package com.college.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.entity.Student;
import com.college.entity.Student2;
import com.college.serviceInterface.StudentInterface;
import com.college.util.StudentUtil;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentInterface studentInterface;

	@PostMapping("/saveStudent")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student1) {
		 
		return new ResponseEntity<Student>(studentInterface.saveStudent(student1), HttpStatus.CREATED);

	}

	@PostMapping("/saveStudent2")
	public ResponseEntity<Student2> saveStudent2(@RequestBody Student2 student2) {

		return new ResponseEntity<Student2>(studentInterface.saveStudent2(student2), HttpStatus.CREATED);

	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable("id") long id, @RequestBody Student student) {

		return new ResponseEntity<>(studentInterface.updateStudent(student, id), HttpStatus.OK);
	}

	@GetMapping("/getall")
	public List<Student> findAll() {
		return studentInterface.getAllStudents();
	}

	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable("id") long id) {
		return studentInterface.deleteStudent(id);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Student> findById( @PathVariable("id") long id){
		return new ResponseEntity<>(studentInterface.findById(id), HttpStatus.OK);

	}
	@GetMapping("/getName/{name}")
	public ResponseEntity<Student> findByName(@PathVariable("name") String name){
		return new ResponseEntity<>(studentInterface.findbyName(name), HttpStatus.OK);

	}
	
	
	/*@GetMapping("/getMiddleName/{name}")
	public ResponseEntity<StudentUtil> findByMiddleName(@PathVariable("name") String name){
		return new ResponseEntity<>(studentInterface.findByMiddleName(name), HttpStatus.OK);

	}
	*/
}
