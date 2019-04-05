package com.manash.client;


import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class SpringRestClient {

	public static void main(String[] args) {
		String resturl="http://localhost:2525/SpringWithRest-App20-RestController/emp/123";
		//create rest template object
		RestTemplate template=null;
				template=new RestTemplate();
		ResponseEntity<?> restEntity=template.getForEntity(resturl, String.class);
		
		HttpStatus status=restEntity.getStatusCode();
		System.out.println(status);
		System.out.println(restEntity.getBody());
		System.out.println("====================");
		String rest= template.getForObject(resturl, String.class);
		System.out.println(rest);
		System.out.println("=====================");
		//create HttpHeader
		HttpHeaders headers=new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		//set HttpMethod mode
		
		
		
	}

}
 