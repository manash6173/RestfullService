package com.manash.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface WishMessage {
	
	@WebMethod
	public String sayHello(String name);

}
