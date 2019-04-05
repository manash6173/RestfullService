package com.manash.exception;


import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.manash.handler.ErrorMessage;

@Provider
public class NoDataFoundExceptionMapper implements ExceptionMapper<NoDataFoundException> {

	@Override
	public Response toResponse(NoDataFoundException exception) {
		Response res=null;
		ErrorMessage errMsg=new ErrorMessage();
		errMsg.setErrorCode(400);
		errMsg.setErrorDesc("Invalid Employee ID");
		
		System.out.println("toResponse() method is executed");
		res=Response.status(Status.BAD_REQUEST)
				.entity(errMsg)
				.type(MediaType.APPLICATION_JSON)
				.build();

		return res;
	}
}
