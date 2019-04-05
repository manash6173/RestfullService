package com.manash.handler;

public class Employee {
	private String empId;
	private String ename;
	private String esal;
	
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEsal() {
		return esal;
	}
	public void setEsal(String esal) {
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ename=" + ename + ", esal=" + esal + "]";
	}

}
