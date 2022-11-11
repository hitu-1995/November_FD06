package com.cjc.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.in.model.Dominoz;
import com.cjc.in.service.DominozService;

@RestController
@RequestMapping("/dApi")
public class DominozController {

	 @Autowired
	  private DominozService service;
	
	   @GetMapping("/geteProduceData/{id}")
	  public Dominoz getData(@PathVariable int id) {
		
	              Dominoz d = service.getDominoz(id);
		      System.out.println("-----  "+d);
	              return d;
	}
	   
	   @PostMapping("/postProduceData")
	   public String insertDta(@RequestBody Dominoz dominoz) {
		System.out.println("---------------------");
		  
		service.insertData(dominoz);
		  
		 System.out.println("------------------------");  
		   return "Data Created in Producer";
	}
}
