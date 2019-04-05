package com.manash.rest;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class PersonInfo implements Serializable {
	
	private int pid;
	private String pname;
	private String addr;
	@JsonSerialize(using=DateFormater.class)
	private Date dob;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "PersonInfo [pid=" + pid + ", pname=" + pname + ", addr=" + addr + ", dob=" + dob + "]";
	}
	

}
