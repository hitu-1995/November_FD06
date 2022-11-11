package com.cjc.in.feignclients;

import java.util.List; 

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cjc.in.model.Student;

@FeignClient(url = "http://localhost:8081/prodApi/" , name = "PRODUCER-SERVICE")
public interface StudentFeignclient {

	@GetMapping("/getAllProduceStudents")
	public List<Student> getAllStudents();
	
	@PostMapping("/insertProduceStudent")
	public String insertStudent(Student student);
}
