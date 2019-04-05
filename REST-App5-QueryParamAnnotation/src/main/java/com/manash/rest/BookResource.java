package com.manash.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;


@Path("/book")
public class BookResource {
	
	 
	@GET
	@Path("{bid}")
	public String getBookPrice(@QueryParam("bid") String bid) {
		return "BookPrice is $300.00";
	}
	@POST
	public String getBookDetails(@QueryParam("name") String name,@QueryParam("author") String author) {
		
		return name+"............"+author;
	}
	@GET
	public String getBook(@Context UriInfo uriInfo) {
		
		List name=uriInfo.getQueryParameters().get("name");
		List author =uriInfo.getQueryParameters().get("author");
		
	return name+"-------"+author;
	}
}
