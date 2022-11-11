package com.cjc.in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDockerDemoApplication {

	public static void main(String[] args) {
		System.out.println("Spring Boot App start");
		System.out.println("Docker demo for Spring Boot through Maven Plugin");
		SpringApplication.run(SpringBootDockerDemoApplication.class, args);
	}

}
