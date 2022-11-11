package com.cjc.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cjc.in.model.Dominoz;

@RestController
@RequestMapping("/sApi")
public class SwiggyController {

	@Autowired
	private RestTemplate template;
	
	
	@GetMapping("/getConsumeData/{id}")
	public Dominoz getData(@PathVariable int id) {
	
		String url = "http://localhost:8081/dApi/geteProduceData/"+id+"";
		
		  Dominoz dominoz = template.getForObject(url, Dominoz.class);
		  
		  return dominoz;
	}
	
	   @PostMapping("/postConsumeData")
	   public String insertDta(@RequestBody Dominoz dominoz) {
		
		    String url = "http://localhost:8081/dApi/postProduceData";
		   
		    String msg = template.postForObject(url, dominoz, String.class);
	
		    
		   return msg;
	}
}
