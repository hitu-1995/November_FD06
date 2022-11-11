package com.cjc.in.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;

@Entity
public class User {

	@Id
	private int uid;
	private String name;
	private String uname;
	private String pass;
	private String address;

	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", uname=" + uname + ", pass=" + pass + ", address=" + address
				+ "]";
	}
	public User(int uid, String name, String uname, String pass, String address) {
		super();
		this.uid = uid;
		this.name = name;
		this.uname = uname;
		this.pass = pass;
		this.address = address;
	}
	public User() {
	}
	
	
	
	
	
}
