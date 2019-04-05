package com.manash.resource;

import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.manash.handler.Employee;

@Path("/employee")
@Singleton
public class EmployeeResource {
	
	
	public EmployeeResource() {
		System.out.println("****Employee Resource constructor****");
	}
	
	@POST
	@Consumes(MediaType.TEXT_PLAIN)
	public Response addEmployee(Employee emp) {
		System.out.println("****EmployeeResource addEmployee()****");
		System.out.println(emp);
		return Response.ok("Employee Added Successfully").build();
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public Response getEmployee() {
		System.out.println("****EmployeeResource getEmployee()****");
		//create employee object
		Employee e=new Employee();
		e.setEmpId("10021");
		e.setEname("Manash");
		e.setEsal("255555");
		return Response.ok(e).build();
	}
}
