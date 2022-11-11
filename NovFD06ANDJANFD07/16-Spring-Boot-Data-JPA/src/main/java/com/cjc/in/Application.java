package com.cjc.in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cjc.in.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("main---start");
	    ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	    EmployeeService service = context.getBean(EmployeeService.class);
	       service.check();
		System.out.println("JPA Application Starts");
		
	}

}
