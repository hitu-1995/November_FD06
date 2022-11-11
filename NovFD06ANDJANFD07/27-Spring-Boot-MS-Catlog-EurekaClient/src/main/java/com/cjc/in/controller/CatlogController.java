package com.cjc.in.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catApi")
public class CatlogController {

	@GetMapping("/getCatlog")
	public ResponseEntity<List<String>> getCatlog() {
		
		return new ResponseEntity<List<String>>(
				Arrays.asList("Clothing were","Electronics","Grocceries"),
				HttpStatus.OK);
	}
}
