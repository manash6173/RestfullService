package com.manash.restcontroller;

import javax.net.ssl.SSLEngineResult.Status;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.manash.binding.EmployeeInfo;

@RestController
public class EmployeeRestController {
	
	/*@GetMapping(value="/emp/{eno}",produces= {"application/json","application/xml"})
	public EmployeeInfo getEmpByEno(@PathVariable("eno") String eno) {
		EmployeeInfo einfo=new EmployeeInfo();
		einfo.setEmpNo(Integer.parseInt(eno));
		einfo.setEname("Smith");
		einfo.setJob("Clerk");
		einfo.setSalary(1234);
		return einfo;
	}*/
	@GetMapping(value="/emp/{eno}",produces= {"application/json","application/xml"})
	public ResponseEntity getEmpByEno(@PathVariable("eno") String eno) {
		EmployeeInfo einfo=new EmployeeInfo();
		einfo.setEmpNo(Integer.parseInt(eno));
		einfo.setEname("Smith");
		einfo.setJob("Clerk");
		einfo.setSalary(1234);		
		return ResponseEntity.ok(einfo);  
		/*return ResponseEntity.status(400).body("Bad Request");*/
	}
	
	@PostMapping(value="/emp",
			consumes= {"application/json","application/xml"},
			produces= {"application/xml","application/json"}
			)
	public /*@ResponseBody*/ EmployeeInfo updateEmp(@RequestBody EmployeeInfo info) {
		
		return info;
	}
	
}