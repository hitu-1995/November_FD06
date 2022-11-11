package com.cjc.in.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Company {

	@Autowired
	@Qualifier("employee")
	private Employee emp;

	public void setEmp(Employee emp) {
		this.emp = emp;
	}


	public void callEmployee() {
		
		String status = emp.status();
		System.out.println(status+" "+emp.getEmpid()+"  "+emp.getName());
		
	}
}
