package com.cjc.in.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/examApi")
public class ExamController {

	
	@GetMapping("/getExam")
	public ResponseEntity<String> checkExam() {
		
		return new ResponseEntity<String>("Exam Controller Works !!",HttpStatus.OK);
	}
}
