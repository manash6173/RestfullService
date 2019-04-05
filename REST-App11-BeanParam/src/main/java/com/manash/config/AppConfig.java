package com.manash.config;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
@ApplicationPath("/app")
public class AppConfig extends Application {
@Override
public Map<String, Object> getProperties() {
	
	Map<String,String> map=new HashMap<String,String>();
	map.put("jersey.config.server.provider.packages", "com.manash.rest");
	
	return super.getProperties();
}
}
