package com.cjc.in.controller;

import java.awt.PageAttributes.MediaType;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.in.model.Student;

@RestController
public class StudentController {

	@RequestMapping(value = "/getData",
			produces ={"application/json","application/xml"}
			)
	
	public Student getData() {
		
		Student stu = new Student();
		stu.setRollno(101);
		stu.setName("XYZ");
		stu.setAddress("Pune");
		
		return stu;
	}
	@RequestMapping(value = "/insertStudent" )
	public String insertStudent(@RequestBody Student stu) {
		System.out.println("------------------");
		System.out.println(stu);
		System.out.println("-----------------");
		return "Inserted";
	}
	
	
}



