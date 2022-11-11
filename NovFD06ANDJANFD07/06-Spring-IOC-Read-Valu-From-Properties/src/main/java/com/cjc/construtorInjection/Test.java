package com.cjc.construtorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/cjc/construtorInjection/bean.xml");

		 Customer customer = context.getBean("cust",Customer.class);
		 
		 System.out.println(customer.getCid());
		 System.out.println(customer.getCname());
		 System.out.println(customer.getAddress());
		 System.out.println(customer.getProduct());
	
		 System.out.println("*** Application End ***");
	}
}