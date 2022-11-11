package com.cjc.in.model;

public class Employee {
	private int id;
    private String name;
    private String address;
    private long mobile;
    private String username;
    


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public long getMobile() {
		return mobile;
	}


	public void setMobile(long mobile) {
		this.mobile = mobile;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", mobile=" + mobile + ", username="
				+ username + "]";
	}
    
    
}
