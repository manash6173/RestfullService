package com.manash.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitalizer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	public Class<?>[] getRootConfigClasses() {
		
		return new Class[] {AppConfig.class};
	}

	@Override
	public Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/*"};
	}

}
