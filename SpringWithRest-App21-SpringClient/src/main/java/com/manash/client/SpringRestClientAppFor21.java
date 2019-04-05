package com.manash.client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class SpringRestClientAppFor21 {

	public static void main(String[] args) {
		//create the url
		String restURL="http://localhost:2525/SpringWithRest-App21-Params/emp/102";
		//create RestTemplate class object
		RestTemplate template=new RestTemplate();
		ResponseEntity<?> response=template.getForEntity(restURL,String.class);
		System.out.println(response.getBody());
		System.out.println("=================");
		String res=template.getForObject(restURL, String.class);
		System.out.println(res);
	}

}
