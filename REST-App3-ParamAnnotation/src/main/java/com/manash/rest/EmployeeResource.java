package com.manash.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.manash.binding.EmployeeInfo;

@Path("/employee")
public class EmployeeResource {
	
	@GET
	@Path("{empId}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public EmployeeInfo getEmployeeById(@PathParam("empId") String empId) {
		EmployeeInfo emp=null;
		//create employee class object
		emp=new EmployeeInfo();
		//set values into employee
		emp.setEmpId(Integer.parseInt(empId));
		emp.setEmpName("Manash");
		emp.setEmpAddr("Hyderbad");
		emp.setSalary(1000.0);
		return emp;
	}
	@GET
	public String getName() {
		return "<h1>Manash</h1>";
	}

}
