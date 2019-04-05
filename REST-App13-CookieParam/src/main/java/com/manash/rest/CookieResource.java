package com.manash.rest;



import java.util.Map;
import java.util.stream.Collectors;

import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/cookie")
public class CookieResource {
	
	@GET
	public Response addCookie() {
		NewCookie cookie1=null;
		NewCookie cookie2=null;
		//create cookie class object
		cookie1=new NewCookie("name","Manash");
		cookie2=new NewCookie("email","swain@gmail.con");
		ResponseBuilder rb=Response.ok("cookie added successfully");
		rb.cookie(cookie1,cookie2);
		return rb.build();
	}
	@GET
	@Path("/get")
	public Response getCookie(@CookieParam("email") String email) {
		 return Response.ok("Cookie value:"+email).build();
		
	}
	
	@GET
	@Path("getAll")
	public Response getAllCookie(@Context HttpHeaders headers) {
		Map<String,Cookie> cookies=headers.getCookies();
		String cookieMsg=cookies.entrySet().stream().map(e->e.getKey()+" = "+e.getValue().getValue()).collect(Collectors.joining("<br/>"));
		
		
		return Response.ok(cookieMsg).build();
	}

}
