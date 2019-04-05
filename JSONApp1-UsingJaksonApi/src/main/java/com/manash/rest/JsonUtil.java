package com.manash.rest;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
	  private ObjectMapper mapper;
	  public JsonUtil() {
		mapper=new ObjectMapper();
	}
	
	public String convertJavaObjectToJson(PersonInfo pinfo) throws JsonProcessingException {
		String json=null;
		//invoke write value method
		json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(pinfo);
		return json;
	}
	public PersonInfo convertJsonToJavaObject(String json) throws JsonParseException, JsonMappingException, IOException {
		File file=null;
		PersonInfo info=null;
		//create a file to represent the json file
		file=new File(json);
		//invoke readValues method
		info=mapper.readValue(file, PersonInfo.class);
		return info;
	}
	public String convertJavaCollectionObjectToJson(List<PersonInfo> list) throws JsonProcessingException {
	  String json=null;
	  json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list);
	  return json;
	}
}
