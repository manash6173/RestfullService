package com.manash.config;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.manash.context.MessageConverter;
import com.manash.context.ResponseMessageConverter;
import com.manash.exception.NoDataFoundException;
import com.manash.exception.NoDataFoundExceptionMapper;

@ApplicationPath("/*")
public class AppConfig extends Application {
	
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> set=new HashSet<Class<?>>();
		set.add(MessageConverter.class);
		set.add(ResponseMessageConverter.class);
		set.add(NoDataFoundException.class);
		set.add(NoDataFoundExceptionMapper.class);
		return set;
	}
	
	@Override
	public Map<String, Object> getProperties() {
		Map<String,Object> map=new HashMap<String,Object>();
		//create one map object
		map.put("jersey.config.server.provider.packages", "com.manash.rest");
		
		return map;
	}
	

}
