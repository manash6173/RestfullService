package com.manash.rest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;


@Path("/rest")
public class RestEasyResource {
	
	
	@GET
	@Path("{name}/{email}")
	public Response getMsg(@PathParam("name")String name,@PathParam("email")String email,@QueryParam("mob")String mob) {
		
		return Response.ok("Hey "+name+"-"+email+"-- "+mob+" WelCome to restEasy implementation").build();
	}
}
