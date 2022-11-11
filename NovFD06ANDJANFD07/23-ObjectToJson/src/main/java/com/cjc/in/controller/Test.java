package com.cjc.in.controller;

import java.io.File;
import java.io.IOException;

import com.cjc.in.model.Student;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {
	public static void main(String[] args) throws Exception{

	   ObjectMapper mapper = new ObjectMapper();
	   Student student = mapper.readValue(new File("student.json"),Student.class);
	   System.out.println(student);
	
	}

	public static void studenWtToJson() throws IOException, StreamWriteException, DatabindException {
		Student stu = new Student();
        stu.setRollno(111);
        stu.setName("AAAA");
        stu.setAddress("Pune");
		
		  ObjectMapper mapper = new ObjectMapper();
		  mapper.writeValue(new File("student.json"), stu);
		  
	    System.out.println("Converted to Json");
	}
}
