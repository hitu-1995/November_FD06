package com.cjc.in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.cjc.in.model.Student;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("Main----Starts");
		 ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
      
		   Student student = context.getBean(Student.class);
		   student.read();
		   System.out.println("***** "+context.getClass().getName()+" *****");
	        System.out.println("*** "+context.getBeanDefinitionCount()+" ****");	  
		System.out.println("Main----Ends");
	}
}
