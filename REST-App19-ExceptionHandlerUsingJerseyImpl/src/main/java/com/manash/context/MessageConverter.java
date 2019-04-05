package com.manash.context;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Consumes;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;

import com.manash.handler.Employee;

@Provider
public class MessageConverter implements MessageBodyReader<Employee> {

	@Override
	public boolean isReadable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		System.out.println("*****isRradable() is executed*****");
		return type==Employee.class;
	}

	@Override
	@Consumes(MediaType.TEXT_PLAIN)
	public Employee readFrom(Class<Employee> type, Type genericType, Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, String> httpHeaders, InputStream entityStream)
			throws IOException, WebApplicationException {
		System.out.println("*****readForm(-) Method is Executed*****");
		//read data from the stream
		InputStreamReader isr=new InputStreamReader(entityStream);
		//read data from the reader line by line 
		BufferedReader br=new BufferedReader(isr);
		String empId=br.readLine();
		String ename=br.readLine();
		String esal=br.readLine();
		//store in employee object
		Employee e=new Employee();
		e.setEmpId(empId);
		e.setEname(ename);
		e.setEsal(esal);
		return e;
	}
}
