package com.cjc.in.model;

import org.springframework.stereotype.Component;

@Component
public class Account {   

	private int acno;
	private String acname;
	private double balance;
	public int getAcno() {
		return acno;
	}
	public void setAcno(int acno) {
		this.acno = acno;
	}
	public String getAcname() {
		return acname;
	}
	public void setAcname(String acname) {
		this.acname = acname;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [acno=" + acno + ", acname=" + acname + ", balance=" + balance + "]";
	}
	
}
