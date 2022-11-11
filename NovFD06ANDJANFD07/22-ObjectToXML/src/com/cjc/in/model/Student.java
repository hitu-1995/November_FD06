package com.cjc.in.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {

	private int rollno;
	private String name;
	private String address;
	
	private Address addr;
	
	
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + ", addr=" + addr + "]";
	}
	
}
