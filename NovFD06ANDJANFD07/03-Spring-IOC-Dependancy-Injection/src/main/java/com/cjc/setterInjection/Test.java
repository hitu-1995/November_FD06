package com.cjc.setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/cjc/setterInjection/bean.xml");
		User user = context.getBean("u",User.class);
		
		System.out.println(user.getUid());
		System.out.println(user.getUname());
		System.out.println(user.getUaddress());
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println("  *** Application End ****");
	}
}
