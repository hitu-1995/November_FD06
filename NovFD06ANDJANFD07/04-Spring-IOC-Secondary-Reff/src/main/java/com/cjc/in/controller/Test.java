package com.cjc.in.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cjc.in.Student;
public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
               Student student = context.getBean("stu",Student.class);
               
               System.out.println(student.getRollno());
               System.out.println(student.getName());
               System.out.println(student.getAddress().getCity());
               System.out.println(student.getAddress().getPinCode());
               System.out.println(student.getAddress().getArea());
	          
                System.out.println("*** Application Ends ***");
	
	}
}







