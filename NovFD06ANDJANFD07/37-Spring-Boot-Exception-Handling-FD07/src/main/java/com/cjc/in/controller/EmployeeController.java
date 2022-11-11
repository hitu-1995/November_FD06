package com.cjc.in.controller;

import java.util.List;

import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.in.model.Employee;
import com.cjc.in.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	 private EmployeeService service;
	 
	
	@GetMapping("/")
	public ResponseEntity<String> checkApi() {
	
		return new ResponseEntity<String>("Api Workin Fine",HttpStatus.OK);
	}
	@PostMapping("/insertEmployee")
	public ResponseEntity<String> insertEmployee(@RequestBody Employee emp) {
	  service.insertEmployee(emp);
		return new ResponseEntity<String>("Employee Inserted",HttpStatus.CREATED);
	}
	@GetMapping("/getEmployee/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable int id) {
		
	 Employee emp =	service.getEmployee(id);
	 
	 return new ResponseEntity<Employee>(emp,HttpStatus.FOUND);
	}
	
	
}
