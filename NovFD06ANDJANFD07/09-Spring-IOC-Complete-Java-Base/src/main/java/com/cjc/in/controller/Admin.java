package com.cjc.in.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cjc.in.configue.AppConfiguration;
import com.cjc.in.model.Account;
import com.cjc.in.service.SBI;

public class Admin {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		SBI sbi = context.getBean("sbi",SBI.class);
		
		sbi.createAccount();
		
		sbi.viewDetails();

		  Account bean = context.getBean("ac",Account.class);
		  System.out.println(bean);
		  

		System.out.println("*** Application Ends  ***");
	}
}
