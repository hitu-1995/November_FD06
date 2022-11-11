package com.cjc.in.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dominoz {

	@Id
	private int did;
	private String orderName;
	private int price;

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Dominoz [did=" + did + ", orderName=" + orderName + ", price=" + price + "]";
	}

}
