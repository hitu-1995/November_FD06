package com.cjc.controller;

public class Employee {

	public Employee() {
	
		System.out.println("Employee :: Constructor");
	}
	
	
	private int eid;
	private String ename;
	private String desig;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		System.out.println("SetEid() is called.......");
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", desig=" + desig + "]";
	}
	
	
}
