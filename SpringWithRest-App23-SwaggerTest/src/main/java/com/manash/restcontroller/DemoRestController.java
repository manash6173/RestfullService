package com.manash.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="DemoRestController",description="Wish Message controller")
@RestController
public class DemoRestController {
	
	@ApiOperation(value="/wish",notes="This mehtod gives the wish message",code=200,httpMethod="GET")
	@GetMapping(value="/wish/{name}")
	public String getWish(@PathVariable("name") String name) {
		return name+"Welcome to Spring Swagger";
	}
	
}
