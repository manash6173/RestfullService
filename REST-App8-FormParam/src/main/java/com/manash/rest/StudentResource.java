package com.manash.rest;


import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import javax.ws.rs.core.Response;

@Path("/form")
public class StudentResource {
	
	@POST
	public Response addStudent(@FormParam("name") String name,@FormParam("email") String email) {
		return Response.ok("<h1 style='color:blue;text-align:center'>Student added successfully with name::"+name+" and Email::"+email).build();
	}
}
