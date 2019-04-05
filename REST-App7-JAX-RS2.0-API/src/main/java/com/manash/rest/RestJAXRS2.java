package com.manash.rest;

import java.util.Calendar;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;



@Path("/wish")
public class RestJAXRS2 {
	
	@GET
	@Path("{name}")
	public Response getMsg(@PathParam("name") String name) {
		 Calendar cal=Calendar.getInstance();
		 int hour=cal.get(Calendar.HOUR_OF_DAY);
		 if(hour<12)
			 return Response.ok("<h1 style='color:red;text-align:center'>Good Morning "+name).build();
		 else if(hour<16)
			 return Response.ok("<h1 style='color:red;text-align:center'>Good AfterNoon "+name).build();
		 else if(hour<20)
			 return Response.ok("<h1 style='color:red;text-align:center'>Good Evening "+name).build();
		 else 
			 return Response.ok("<h1 style='color:red;text-align:center'>Good Night "+name).build();
	}
}
