package com.cjc.in.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.in.model.Employee;

@RestController
@RequestMapping("/prodApi")
public class ProducerController {

	@GetMapping("/getProduceEmp")
	public Employee getEmployee() {
		
		Employee emp = new  Employee();
		emp.setEmpId(101);
		emp.setEmpName("Swapnil");
		emp.setEmpAddress("Pune");
   
		  return emp;
	}
}
