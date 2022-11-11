package com.cjc.in.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orderApi")
public class OrderController {

	@GetMapping("/orderSatus")
	public ResponseEntity<String> status() {
		
		return new ResponseEntity<String>(
				"Order Place Successfull",
				HttpStatus.ACCEPTED);
	}
}
