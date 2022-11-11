package com.cjc.in.model;

public class Employee {

	private int eid;
	private String ename;
	private String eaddress;
	private String desig;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + ", desig=" + desig + "]";
	}
	public Employee(int eid, String ename, String eaddress, String desig) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eaddress = eaddress;
		this.desig = desig;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
