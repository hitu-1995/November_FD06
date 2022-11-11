package com.cjc.in.configue;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cjc.in.model.Account;

@Configuration
@ComponentScan(basePackages = "com.cjc")
public class AppConfiguration {

	@Bean(value = "ac")
	public Account getAccount() {
		
		Account ac = new Account();
		ac.setAcno(111);
		ac.setAcname("Akshay");
		ac.setBalance(9000);
		return  ac;
	}
	
}
