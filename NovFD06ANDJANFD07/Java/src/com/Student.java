package com;

public class Student {

	private int rollno;

	public Student(int rollno) {
		super();
		this.rollno = rollno;
	}
	private String name;

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
