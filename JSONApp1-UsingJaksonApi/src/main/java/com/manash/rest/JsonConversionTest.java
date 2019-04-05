package com.manash.rest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class JsonConversionTest {

	public static void main(String[] args) throws IOException {
		JsonUtil util=null;
		PersonInfo pinfo=null,pinfo1=null;
		List<PersonInfo> list=null;
		//create jsonUtil class object
        util=new JsonUtil();
        //create person class object and set values
        pinfo=new PersonInfo();
        pinfo.setPid(10001);
        pinfo.setPname("Dipu");
        pinfo.setAddr("Hyd");
        pinfo.setDob(new Date());
        
        pinfo1=new PersonInfo();
        pinfo1.setPid(1002);
        pinfo1.setPname("sipu");
        pinfo1.setAddr("Mum");
        pinfo1.setDob(new Date());
        
        //create list collection
        list=new ArrayList<PersonInfo>();
        list.add(pinfo);
        list.add(pinfo1);
        //invoke methods
        System.out.println(util.convertJavaObjectToJson(pinfo));
        System.out.println("========================================");
        System.out.println(util.convertJsonToJavaObject("personInfo.json"));
        System.out.println("==============================================");
        System.out.println(util.convertJavaCollectionObjectToJson(list));
	}

}
