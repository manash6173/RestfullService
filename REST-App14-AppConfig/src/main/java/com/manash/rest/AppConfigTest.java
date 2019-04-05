package com.manash.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/app")
public class AppConfigTest {
    
	@GET
	public Response wish() {
		return Response.ok("WelCome to JERSEY 2.0 API").build();
	}
}
