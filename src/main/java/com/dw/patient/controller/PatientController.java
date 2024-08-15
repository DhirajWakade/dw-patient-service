package com.dw.patient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dw.patient.entity.Patient;
import com.dw.patient.service.PatientService;

@RestController
@RequestMapping("/api/v1")
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	@GetMapping("/welcome")
	public String welcome()
	{
		return "Welcome to Patient Service"; 		
	}
	
	@GetMapping("/patient")
	public List<Patient> getPatient()
	{
		return patientService.getPatient();		
	}
	
	@PostMapping("/patient")
	public Patient savePatient(@RequestBody Patient patient)
	{
		return patientService.savePatient(patient);		
	}
	
	@DeleteMapping("/patient/{patientId}")
	public Boolean deletePatient(@PathVariable Long patientId)
	{
		return patientService.deletePatient(patientId);
	}
}
