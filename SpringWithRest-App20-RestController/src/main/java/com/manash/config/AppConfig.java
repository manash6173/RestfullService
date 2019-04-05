package com.manash.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages= {"com.manash.rest.controller"})
@EnableWebMvc
public class AppConfig {
	public AppConfig() {
		System.out.println("AppConfig.AppConfig(5)");
	}
	

}
