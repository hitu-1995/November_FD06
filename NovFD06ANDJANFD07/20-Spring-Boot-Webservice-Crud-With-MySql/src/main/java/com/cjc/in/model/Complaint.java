package com.cjc.in.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Complaint {

	@Id
	private int cid;
	private String msg;
	public int getCid() {    
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "Complaint [cid=" + cid + ", msg=" + msg + "]";
	}
	
	
}
