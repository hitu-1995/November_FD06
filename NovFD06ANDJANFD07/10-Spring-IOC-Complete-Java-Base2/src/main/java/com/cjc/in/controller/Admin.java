package com.cjc.in.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cjc.in.configue.AppConfiguration;
import com.cjc.in.model.Company;
import com.cjc.in.model.Employee;

public class Admin {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		   Company company = context.getBean("company",Company.class);
		   company.callEmployee();
		
//		 Employee emp1 = context.getBean("employee",Employee.class);
//	     System.out.println(emp1);	
//	     Employee emp2 = context.getBean("employee",Employee.class);
//	     System.out.println(emp2);	
		System.out.println("*** Application Ends  ***");
	}
}
