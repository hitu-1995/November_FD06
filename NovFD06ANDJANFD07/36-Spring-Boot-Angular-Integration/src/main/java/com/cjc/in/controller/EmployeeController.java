package com.cjc.in.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.in.model.Employee;

@RestController
@RequestMapping("/crudAPI")
@CrossOrigin("*")
public class EmployeeController {

	@PostMapping("/inserEmployee")
	public ResponseEntity<String> inserEmployee(@RequestBody Employee employee) {
		System.out.println(employee);
		return new ResponseEntity<String>("Inserted ",HttpStatus.OK);
	}
	
	@GetMapping("/getAllEmployee")
	public ResponseEntity<List<Employee>> getAllEmployee() {
		Employee e1 =new Employee();
		e1.setId(101);
		e1.setName("ABC");
		e1.setAddress("Pune");
		e1.setMobile(98765);
		e1.setUsername("AAA");
		Employee e2 =new Employee();
		e2.setId(102);
		e2.setName("XYZ");
		e2.setAddress("Pune");
		e2.setMobile(456789);
		e2.setUsername("BBB");
		
		List<Employee> list = Arrays.asList(e1,e2);
		
		return new ResponseEntity<List<Employee>>(list,HttpStatus.OK);
	}
}
