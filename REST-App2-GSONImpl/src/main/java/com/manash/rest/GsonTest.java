package com.manash.rest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Date;

public class GsonTest {

	public static void main(String[] args) throws FileNotFoundException  {
		GsonUtil util=null;
		PersonInfo pinfo=null;
		//create object for Gson util
		pinfo=new PersonInfo();
	    pinfo.setPid(142);
	    pinfo.setPname("Rahul");
	    pinfo.setAddrs("Hyd");
	    pinfo.setDob(new Date());
	    util=new GsonUtil();
	    //invoke util class methods
	    System.out.println(util.convertJavaObjectToJSON(pinfo));
	    System.out.println("==============================");
	    System.out.println(util.createJsonToJavaObject("personInfo.json"));
	   
	}
}
