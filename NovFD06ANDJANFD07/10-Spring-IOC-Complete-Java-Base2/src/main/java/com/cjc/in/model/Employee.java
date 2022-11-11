package com.cjc.in.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;


@Scope(scopeName = "prototype")
public class Employee {

	  @Value("${emp.empid}")
	   private int empid ;
	   
	   @Value("${emp.name}")
	   private String name;  
	
	 public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee() {
		
		   System.out.println("Employee :: constructor");
	}
	 
	 public  String status() {
		
		 return "Employee is working";
	}
}
