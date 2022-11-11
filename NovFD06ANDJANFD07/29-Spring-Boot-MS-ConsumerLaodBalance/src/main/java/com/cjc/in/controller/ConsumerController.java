package com.cjc.in.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cjc.in.model.Employee;
@RestController
@RequestMapping("/consumeApi")
public class ConsumerController {
	@Autowired
	private RestTemplate template;
	
	@GetMapping("/getConsumeEmp")
	public Employee getEmpData() {

		// without  load balance (producer url)
		//String url = "http://localhost:8081/prodApi/getProduceEmp";
	     
		//with  load balance
		String url = "http://zuul/getproducer/prodApi/getProduceEmp";
		Employee employee = template.getForObject(url, Employee.class);
		return employee;
	}
}
