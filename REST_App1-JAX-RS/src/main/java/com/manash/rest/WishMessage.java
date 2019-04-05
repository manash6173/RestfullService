package com.manash.rest;

import java.util.Calendar;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;


@Path("/wish")
public class WishMessage {
	public WishMessage() {
     System.out.println("Constructor is executed");

	}
	
	@GET
	public String sayHello() {
		Calendar cal=null;
		int hour=0;
		//get calendar class object
		cal=Calendar.getInstance();
		hour=cal.get(Calendar.HOUR_OF_DAY);
		if(hour<=12)
			return "<h1 style='color:red;text-align:center'>Good Morning</h1>";
		else if(hour<=16)
			return "<h1 style='color:red;text-align:center'>Good AfterNoon</h1>";
		else if(hour<=20)
			return "<h1 style='color:red;text-align:center'>Good Evening</h1>";
		else
			return "<h1 style='color:red;text-align:center'>Good Night</h1>";
	}

}
