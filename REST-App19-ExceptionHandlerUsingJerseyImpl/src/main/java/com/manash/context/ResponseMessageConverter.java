package com.manash.context;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

import com.manash.handler.Employee;

@Provider
public class ResponseMessageConverter implements MessageBodyWriter<Employee> {

	@Override
	public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		System.out.println("*** isWriteable() method is executed***");
		return type==Employee.class;
	}

	@Override
	@Produces(MediaType.TEXT_HTML)
	public void writeTo(Employee t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream)
			throws IOException, WebApplicationException {
		System.out.println("****writeTo() method is executed****");
		//create writer object
		Writer writer=new PrintWriter(entityStream);
		writer.write(t.getEmpId());
		writer.write("<br>");
		writer.write(t.getEname());
		writer.write("<br>");
		writer.write(t.getEsal());
		writer.flush();
		writer.close();
		
	}
	@Override
	public long getSize(Employee t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		// TODO Auto-generated method stub
		return 0;
	}

}
