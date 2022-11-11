package com.cjc.in.service;

import com.cjc.in.model.Employee;

public interface EmployeeService {

	void insertEmployee(Employee emp);

	Employee getEmployee(int id);

}
