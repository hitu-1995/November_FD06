package com.cjc.in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cjc.in.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		UserService service = context.getBean(UserService.class);
		
                 service.check();
                 
                 System.out.println("** Application End **");
		
	}

}



