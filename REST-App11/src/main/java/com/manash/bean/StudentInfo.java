package com.manash.bean;

import javax.ws.rs.FormParam;

public class StudentInfo {
	
	@FormParam("sname")
	private String sname;
	@FormParam("saddr")
	private String addr;
	@FormParam("email")
	private String email;
	@FormParam("mobileNumber")
	private double mobileNum;
	
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(double mobileNum) {
		this.mobileNum = mobileNum;
	}
	@Override
	public String toString() {
		return "StudentInfo [sname=" + sname + ", addr=" + addr + ", email=" + email + ", mobileNum=" + mobileNum + "]";
	}
	

}
