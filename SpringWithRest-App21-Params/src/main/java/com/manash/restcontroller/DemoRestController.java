package com.manash.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	
	//This Method binds simple get mode request 
	@GetMapping("/wish")
	public String getWish() {
		return "Welcome to spring with rest!!!";
	}
	//This Method binds simple get mode request with path param
	@GetMapping("/msg/{name}")
	public String getMsg(@PathVariable("name") String name) {
		return name+",  Welcome to spring with rest!!!";
	}
	//This Method binds simple get mode request with query param
		@GetMapping("/get")
		public String getParam(@RequestParam("name") String name) {
			return name+",  Welcome to spring with rest!!!";
		}
	
	


}
