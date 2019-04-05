package com.manash.resource;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;


@Path("/car")
public class CarResource {

	@GET
	@Path("{model}/{name}/{city}")
	public Response getCarStatus(@PathParam("model")   String model,
			                     @PathParam("name")    String name,
			                     @MatrixParam("color") String color,
			                     @PathParam("city")    String city,
			                     @MatrixParam("loc") String loc) {
		System.out.println("model="+model);
		System.out.println("Name="+name);
		System.out.println("Color="+color);
		System.out.println("City="+city);
		System.out.println("Location="+loc);
		
		return Response.ok("Successful").build();
	}
}
