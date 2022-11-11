package com.cjc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Main----start");
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	
		       ((ConfigurableApplicationContext)context).close();
		
		 System.out.println("Main----End");
		
		
	
	}
}
