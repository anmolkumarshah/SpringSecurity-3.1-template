package com.anmol.SpringSecurityExmple.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anmol.SpringSecurityExmple.model.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	static List<Student> students = null;
	
	static {
		Student s1 = Student.builder().name("Anmol").id(1l).build();
		Student s2 = Student.builder().name("Saloni").id(2l).build();
		Student s3 = Student.builder().name("Suman").id(3l).build();
		Student s4 = Student.builder().name("Rajesh").id(4l).build();
		
		students = List.of(s1,s2,s3,s4);
	}
	
	@GetMapping
	public ResponseEntity<List<Student>> getAllStudent(){
		return ResponseEntity.ok(students);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable("id") Long id){
		List<Student> li = students.stream().filter(el -> el.getId().equals(id)).toList();
		return ResponseEntity.ok(li.get(0));
	}

}
