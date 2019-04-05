package com.manash.rest.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.manash.binding.EmployeeInfo;

@RestController
//@RequestMapping(value="/spring")
public class SpringRestController {
	public SpringRestController() {
		System.out.println("SpringRestController.SpringRestController(6)");
	}
	
	//@RequestMapping(value="/wish",method= {RequestMethod.GET},path="{/name}")
     @GetMapping(value="/wish/{name}")
	public String getWish(@PathVariable("name") String name) {
		return name+" Welcome to SpringWithRest ...!!";
	}
     @PostMapping("/msg/{name}")
     public String getMsg(@PathVariable("name") String name) {
    	 return name+"Welcome to Spring with Rest";
     }
     
     @PostMapping(value="/emp",
    		 produces= {"application/xml"},
    		 consumes= {"application/json"})
     public @ResponseBody EmployeeInfo getEmp(@RequestBody EmployeeInfo emp) {
    	 System.out.println("Employee method");
    	 //create EmployeeInfo
    	 EmployeeInfo info=new EmployeeInfo();
    	 info.setEmpNo(101);
    	 info.setEname("Smith");
    	 info.setAddr("New WOrk");
    	 return info; 
     }
     
     @GetMapping(value="/emp/{empNo}")
     public @ResponseBody EmployeeInfo getEmpById(@PathVariable("empNo") String empNo) {
    	 //create EmployeeInfo object
    	 EmployeeInfo info=new EmployeeInfo();
    	 info.setEmpNo(123);
    	 info.setEname("Rishu");
    	 info.setAddr("Hyd");
    	 return info;
     }
}
