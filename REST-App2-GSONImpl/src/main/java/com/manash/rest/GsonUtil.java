package com.manash.rest;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonUtil {
	private Gson gson;
	
	public GsonUtil() {
		gson=new GsonBuilder().setPrettyPrinting().create();
	}
	
	public String convertJavaObjectToJSON(PersonInfo pinfo) {
		String str=null;
		//invoke methods to convert json
		str=gson.toJson(pinfo);
		return str;
	}
 
	public PersonInfo createJsonToJavaObject(String json) throws FileNotFoundException {
		PersonInfo pinfo=null;
		 FileReader reader= new FileReader(json);
		pinfo=gson.fromJson(reader, PersonInfo.class);
		return pinfo;
	}
}
