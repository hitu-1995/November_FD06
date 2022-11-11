package com.cjc.in.model;

import org.springframework.stereotype.Component;

@Component
public class Student {
	public Student() {
		System.out.println("Student :: Constructor");
	}
	
	public void read() {
		
		System.out.println("Student :: is Reading");
	}
}
