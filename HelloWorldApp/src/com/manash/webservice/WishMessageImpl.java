package com.manash.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(endpointInterface="com.manash.webservice.WishMessage")
public class WishMessageImpl implements WishMessage {

	@WebMethod
	@Override
	public @WebResult String sayHello(
			@WebParam(name="name")
			String name) {
		
		return "User::"+name;
	}

}
