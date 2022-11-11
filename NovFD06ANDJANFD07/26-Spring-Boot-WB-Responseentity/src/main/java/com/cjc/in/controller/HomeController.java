package com.cjc.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.in.model.Employee;
import com.cjc.in.service.EmployeeService;

@RestController
@RequestMapping("/respApi")
public class HomeController {

	@Autowired
	private EmployeeService service;

	@GetMapping("/")
	public ResponseEntity<String> checkApp() {

		return new ResponseEntity<String>("App is Running Perfectly", HttpStatus.OK);
	}

	@PostMapping("/insertEmployee")
	public ResponseEntity<String> insertEmployee(@RequestBody Employee emp) {

		boolean flag = service.insertEmployee(emp);
		if (flag)
			return new ResponseEntity<String>("Employee Added ", HttpStatus.CREATED);
		else
			return new ResponseEntity<String>("Employee Alredy Added ", HttpStatus.ALREADY_REPORTED);
	}

	@GetMapping("/getSingleEmployee/{id}")
	public ResponseEntity<Employee> getSingleEmployee(@PathVariable int id) {

		Employee employee = service.getSingleEmployee(id);

		if (employee == null)
			return new ResponseEntity<Employee>(employee, HttpStatus.NOT_FOUND);
		else
			return new ResponseEntity<Employee>(employee, HttpStatus.FOUND);
	}

}
