package com.cjc.in.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.in.model.Employee;
import com.cjc.in.service.EmployeeService;

@RestController
@CrossOrigin("*")
@RequestMapping("/empApi")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@PostMapping("/insertEmp")
	public ResponseEntity<String> inserEmployee(@RequestBody Employee emp) {
		
		  String msg =  service.insertEmployee(emp);
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
	
	  @GetMapping("/getAllEmployee")
       public ResponseEntity<List<Employee>> getEmpList() {
		
		  List<Employee> empList = Arrays.asList(
				  new Employee(101, "ABC", "Pune", "aaa", "aaaa"),
				  new Employee(102, "XYZ", "Mumbai", "ssss", "ssss"));
		  return new ResponseEntity<List<Employee>>(empList,HttpStatus.OK);
	}
}

