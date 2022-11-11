package com;

import java.util.Comparator;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
	   
		  IBM ibm = new IBM() {
			
			@Override
			public void add(int a, int b) {
				
				 System.out.println(a+b);
				
			}
		};

		   ibm.add(20, 30);
		   
		   Comparator<Student> rollsort = (Student s1,Student s2) -> s1.getRollno()-s2.getRollno();
				   

		TreeSet<Student> set = new TreeSet<Student>(rollsort);
	
	}
}

class Glove{
	private String color;

	public Glove(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
}

class Minion {
	
	private Glove glove;
	private String color;
	public Minion(Glove glove) {
		super();
		this.glove = glove;
		this.color = "yellow";
	}
	public Glove getGlove() {
		return glove;
	}
	public String getColor() {
		return color;
	}
	
   	
	
}

