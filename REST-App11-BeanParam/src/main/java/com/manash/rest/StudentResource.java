package com.manash.rest;



import javax.ws.rs.BeanParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;



import com.manash.bean.StudentInfo;

@Path("/form")
public class StudentResource {
	
	
	@POST
	public Response addStudent(@BeanParam StudentInfo sInfo) {
		return Response.ok("Student Registration Successful with given data ::"+sInfo.toString()).build();
	}

}
