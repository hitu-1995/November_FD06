package com.cjc.in.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cjc.in.service.SBI;

public class Admin {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		SBI sbi = context.getBean("sbi",SBI.class);
		
		sbi.createAccount();
		
		sbi.viewDetails();
		
		System.out.println("*** Application Ends  ***");
	}
}
