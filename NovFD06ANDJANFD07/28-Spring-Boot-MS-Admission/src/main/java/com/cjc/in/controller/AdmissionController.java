package com.cjc.in.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addApi")
public class AdmissionController {

	
	@GetMapping("/checkAdd")
	public ResponseEntity<String> checkAdmission() {
		
		return new ResponseEntity<String>("Admission Controller Works !!",HttpStatus.OK);
	}
}
