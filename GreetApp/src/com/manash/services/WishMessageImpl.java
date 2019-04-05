package com.manash.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(endpointInterface="com.manash.services.WishMessage")
public class WishMessageImpl implements WishMessage {
    @WebMethod
	@Override
	public
	    @WebResult
	    String sayHello(
			@WebParam(name="name") 
			 String name) {
		
		return "Hello "+name;
	}

}
