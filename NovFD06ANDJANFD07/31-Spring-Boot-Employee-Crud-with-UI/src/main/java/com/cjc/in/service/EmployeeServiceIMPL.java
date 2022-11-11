package com.cjc.in.service;

import org.springframework.stereotype.Service;

import com.cjc.in.model.Employee;

@Service
public class EmployeeServiceIMPL implements EmployeeService{

	@Override
	public String insertEmployee(Employee emp) {
		System.out.println("**********  Employee Data : "+emp+" **************");
		
		return "Employee Inserted ";
	}

}
