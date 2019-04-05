package com.manash.rest;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;




@Path("/header")
public class HeaderParamTest {
	
	@GET
	public Response getHeaders(@HeaderParam("user-agent") String header) {
		return Response.ok("User-Agent Details::"+header).build();
	}
	
	@GET
	@Path("/all")
	@Produces(MediaType.TEXT_HTML)
	public Response getAllHeaders(@Context HttpHeaders httpHeaders) {
		Map map=new HashMap();
		String st[]=new String[]{"manassh"};
		
		for(String hd:httpHeaders.getRequestHeaders().keySet()) {
			map.put(hd, httpHeaders.getHeaderString(hd));
			return Response.ok(hd).build();
			
		}
		System.out.println(map);  
		return Response.ok("manash").build();
	}
	

}
