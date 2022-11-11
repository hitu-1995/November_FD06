package com.cjc.in.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProfileController {

	@Value("${cjc.msg}")
	private String msg;
	
	//@GetMapping("/checkProfile")
	@RequestMapping("/proApi")
	public String checkProfile() {
		
		return "Welcome To "+msg+"  Profile";
	}
}
