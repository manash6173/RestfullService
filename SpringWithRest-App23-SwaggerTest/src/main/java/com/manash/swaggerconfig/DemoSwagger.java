package com.manash.swaggerconfig;

import java.util.ArrayList;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class DemoSwagger {
	//create docket class object
    Docket docket=new Docket(DocumentationType.SWAGGER_2)
    		         .select()
    		         .apis(RequestHandlerSelectors.basePackage("com.manash.*"))
    		         .paths(PathSelectors.any())
    		         .build()
    		         .apiInfo(apiInfo());
    public ApiInfo apiInfo() {
    	
    	Contact contact=new Contact("Manash Kumar Swain", "http://localhost:2525/Manash", "manashswain@gmai.com");
    	ApiInfo info=new ApiInfo("Swagger",
    			                  "Wish Controller",
    			                 "1.0", "url", contact, "apache 2.0", "www.apache.com",new ArrayList<>());
    	return info;
    	
    }
}
