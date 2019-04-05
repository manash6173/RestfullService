package com.manash.webservice;

import javax.jws.WebService;

@WebService(name="WishMessage")
public interface WishMessage {
	public String sayHello(String name);

}
