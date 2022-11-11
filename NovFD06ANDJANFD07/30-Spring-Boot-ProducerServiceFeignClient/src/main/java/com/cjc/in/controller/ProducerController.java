package com.cjc.in.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.rmi.CORBA.Stub;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.in.model.Student;

@RestController
@RequestMapping("/prodApi")
public class ProducerController {

	@GetMapping("/getAllProduceStudents")
	public List<Student>  getAllStudents() {
		
		Student stu = new Student(101,"ABC","Mumbai");
		Student stu1 = new Student(102,"XYZ","Nashik");
		Student stu2 = new Student(103,"PQR","Nagpur");
		List<Student> sList = new ArrayList<Student>();
		sList.add(stu);
		sList.add(stu1);
		sList.add(stu2);
		return sList;
	}
	
	@PostMapping("/insertProduceStudent")
	public String  insertStudent(@RequestBody Student student) {
	
		System.out.println("*** "+student+"  ****");
		return "Student Object Is Inserted "+student;
	}
}







