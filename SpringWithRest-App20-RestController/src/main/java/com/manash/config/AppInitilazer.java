package com.manash.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitilazer extends AbstractAnnotationConfigDispatcherServletInitializer {
	public AppInitilazer() {
		System.out.println("AppInitilazer.AppInitilazer(1)");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("AppInitilazer.getRootConfigClasses(2)");
		return new Class[] {AppConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("AppInitilazer.getServletConfigClasses(3)");
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("AppInitilazer.getServletMappings(4)");
		return new String[] {"/*"};
	}

}
