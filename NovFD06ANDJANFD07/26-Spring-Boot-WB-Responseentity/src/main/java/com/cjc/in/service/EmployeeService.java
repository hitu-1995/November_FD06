package com.cjc.in.service;

import com.cjc.in.model.Employee;

public interface EmployeeService {

	boolean insertEmployee(Employee employee);

	Employee getSingleEmployee(int id);
	
}
