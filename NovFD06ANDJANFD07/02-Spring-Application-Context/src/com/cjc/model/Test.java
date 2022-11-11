package com.cjc.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cjc.controller.Employee;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	  
		  // Employee employee = context.getBean("emp",Employee.class);
		   
		  // System.out.println(employee);
	
		System.out.println("Main----End");
	}
	
}
