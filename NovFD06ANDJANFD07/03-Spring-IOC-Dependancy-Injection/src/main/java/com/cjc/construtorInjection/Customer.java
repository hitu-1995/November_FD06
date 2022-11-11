package com.cjc.construtorInjection;

public class Customer {
	private int cid;
	private String cname;
	private String address;
	private String product;
	
	public Customer() {
	  System.out.println("Customer :: Constructor");
	}
	public Customer(int cid, String cname, String address, String product) {
	
		this.cid = cid;
		this.cname = cname;
		this.address = address;
		this.product = product;
	    System.out.println("Customer :: Constructor :: Param");
	}

	public int getCid() {
		return cid;
	}

	public String getCname() {
		return cname;
	}

	public String getAddress() {
		return address;
	}

	public String getProduct() {
		return product;
	}
	
	
	
}
