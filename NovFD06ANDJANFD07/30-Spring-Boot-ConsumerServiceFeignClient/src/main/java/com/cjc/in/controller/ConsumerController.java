package com.cjc.in.controller;

import java.util.List;

import org.bouncycastle.jcajce.provider.symmetric.TEA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cjc.in.feignclients.StudentFeignclient;
import com.cjc.in.model.Student;

@RestController
@RequestMapping("/consumeApi")
public class ConsumerController {

//	@Autowired
//	private RestTemplate restTemplate;

	@Autowired
	private StudentFeignclient client;
	
	
	@GetMapping("/getAllConsumeStudents")
	public List<Student> getAllStudents() {
		
//		String url = "http://localhost:8081/prodApi/getAllProduceStudents";
//		List<Student> list = restTemplate.getForObject(url, List.class);
		System.out.println("*****  "+client.getClass().getName()+"  *****");
		List<Student> list = client.getAllStudents();
		return list;
	}
	
	@PostMapping("/insertConsumeStudent")
	public String insertStudent(@RequestBody Student student) {
		
		return   "Consumer Data "+student+ "   "+client.insertStudent(student);
	}
}
