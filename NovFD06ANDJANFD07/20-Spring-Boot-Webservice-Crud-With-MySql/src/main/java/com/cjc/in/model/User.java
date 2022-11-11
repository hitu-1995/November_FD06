package com.cjc.in.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {

	@Id
	private int id;
	private String name;
	private String address;
	private long mob;
	
	@OneToOne
	private Complaint comlaint;
	
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
	public long getMob() {
		return mob;
	}
	public void setMob(long mob) {
		this.mob = mob;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + ", mob=" + mob + "]";
	}
	public User(int id, String name, String address, long mob) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.mob = mob;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
