package com.dw.patient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/patient")
public class PatientController {
	
	@GetMapping("/hello")
	public String sayHello()
	{
		return "Welcome to Patient Service";		
	}
}
