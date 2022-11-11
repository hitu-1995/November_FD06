package com.cjc.model;

public class Student {

	public Student() {
   
	   System.out.println("Student :: Constructor");
	}
	
	
	public void init() {
		System.out.println("Student Bean is Created....."+this.hashCode());
	}
	
	public void destroy() {
		System.out.println("Student Bean is Destroyed....."+this.hashCode());
	}
}
