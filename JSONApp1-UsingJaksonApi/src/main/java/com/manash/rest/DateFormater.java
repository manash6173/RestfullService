package com.manash.rest;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class DateFormater extends JsonSerializer<Date> {

	@Override
	public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
		SimpleDateFormat sdf=null;
		//create simple data format class object
		sdf=new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss");
		String dt=sdf.format(value);
		gen.writeString(dt);
	}
}
