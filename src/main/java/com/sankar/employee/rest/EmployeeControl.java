package com.sankar.employee.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeControl {
	@GetMapping("/")
	public String test(){
		return "Spring boot Rest";
	}
	
	@RequestMapping(value = "emp/", method=RequestMethod.GET)
	public ResponseEntity<Employee> getEmployee(){
		return new ResponseEntity<Employee>(new Employee(1,"SANKAR","JAVA RESOURCE",10000), 
				HttpStatus.OK);
		
	}
}
