package com.manash.restclient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.manash.binding.EmployeeInfo;

public class SpringRestClientAppFor21 {

	public static void main(String[] args) {
		//create the url
		String restURL="http://localhost:2525/SpringWithRest-App21-Params/emp/{id}";
		String resturl="http://localhost:2525/SpringWithRest-App21-Params/emp";
        
		//create List object to pass mediatypes
	    List<MediaType> mediaType=new ArrayList();
	    mediaType.add(MediaType.APPLICATION_XML);
	    mediaType.add(MediaType.APPLICATION_JSON);
	    
	  //create map collection to pass param value
	  		Map<String,String> map=new HashMap<String,String>();
	  		map.put("id", "111");
	    
		//create RestTemplate class object
		RestTemplate template=new RestTemplate();
		//define header for the request
		HttpHeaders headers=new HttpHeaders();
		headers.setAccept(mediaType);
		HttpEntity entity=new HttpEntity<>(headers);
		//invoke exchange method
		ResponseEntity<String> response= template.exchange(restURL, HttpMethod.GET, entity, String.class,map);
		System.out.println(response);
		
		//ResponseEntity<?> response=template.getForEntity(restURL,String.class);
		//System.out.println(response.getBody());
		System.out.println("Get Request::=================");
		
		EmployeeInfo res=template.getForObject(restURL, EmployeeInfo.class,map);
		System.out.println(res);
		System.out.println("Post request::=========================");
		//create EmployeeInfo class object
		EmployeeInfo empInfo=new EmployeeInfo();
		empInfo.setEmpNo(222);
		empInfo.setEname("Raju");empInfo.setJob("Manager");empInfo.setSalary(14522);		
		//send post mode request
	    ResponseEntity<String> postRes=template.postForEntity(resturl, empInfo, String.class);
	    System.out.println(postRes.getBody());
	   
	}

}
