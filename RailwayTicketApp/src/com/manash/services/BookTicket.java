package com.manash.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name="BookTicket")
public interface BookTicket {
	@WebMethod
	public TicketInfoType bookType(PersonInfoType personInfo,JournyInfoType journyInfo);

}
