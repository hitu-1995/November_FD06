package com.cjc.in.configue;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import com.cjc.in.model.Company;
import com.cjc.in.model.Employee;

@Configuration
@ComponentScan(basePackages = "com.cjc")
@PropertySource(value = "info.properties")
public class AppConfiguration {

	@Bean
	public Employee	 employee() {
		
		return new Employee();
	}
	@Bean
	public Employee	 employee1() {
		
		return new Employee();
	}
	@Bean
	 public Company	company() {
		Company cmp = new Company();
		 
		return cmp;
	}
	
}
