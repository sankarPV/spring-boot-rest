package com.sankar.employee.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeControl {
	@GetMapping("/")
	public String test(){
		return "Spring boot Rest";
	}
}
