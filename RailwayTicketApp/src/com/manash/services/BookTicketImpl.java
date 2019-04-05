package com.manash.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(endpointInterface="com.manash.services.BookTicket")
public class BookTicketImpl implements BookTicket {
	@WebMethod
	@Override
	public @WebResult TicketInfoType bookType(
		  @WebParam	PersonInfoType personInfo,@WebParam JournyInfoType journyInfo) {
		//ticket generation logics
		TicketInfoType ticket=new TicketInfoType();
		//set values into ticket
		ticket.setTrainNo("18643");
		ticket.setTrainName("Prashanti");
		ticket.setBordingAt("Berhampur");
		ticket.setReservationUpto("Bangelore");
		ticket.setPnr("321456l");
		ticket.setDOJ("03-02-2019");
		
		return ticket;
	}

}
