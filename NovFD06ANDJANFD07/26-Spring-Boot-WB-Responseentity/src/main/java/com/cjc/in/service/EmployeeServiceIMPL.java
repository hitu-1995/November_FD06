package com.cjc.in.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.cjc.in.model.Employee;

@Service
public class EmployeeServiceIMPL implements EmployeeService {

	Map<Integer, Employee> map = new HashMap<Integer, Employee>();

	@Override
	public boolean insertEmployee(Employee employee) {

		Integer key = employee.getId();

		Set<Integer> set = map.keySet();

		boolean b = set.contains(key);

		if (b)
			return false;
		else {
			map.put(key, employee);
			return true;
		}
	}

	@Override
	public Employee getSingleEmployee(int id) {

		Employee employee = map.get(id);

		return employee;
	}
}
