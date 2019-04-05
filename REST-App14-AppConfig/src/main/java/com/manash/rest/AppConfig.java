package com.manash.rest;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/*")
public class AppConfig extends Application {
	@Override
	public Map<String, Object> getProperties() {
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("jersey.config.server.provider.packages", "com.manash.rest");
		return map;
	}

}
