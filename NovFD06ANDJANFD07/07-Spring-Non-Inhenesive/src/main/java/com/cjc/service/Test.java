package com.cjc.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		User user = context.getBean("user",User.class);
		  
		    if(user.getSim()!=null) {
		    	
		    	  user.getSim().calling();
				   user.getSim().browsing();
		    }else { 
		    	System.out.println("User :: does not have Sim");
		    }
		 
		System.out.println("*** Application Ends ***");
	}
}
