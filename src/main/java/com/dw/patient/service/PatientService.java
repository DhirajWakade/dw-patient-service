package com.dw.patient.service;

import java.util.List;

import com.dw.patient.entity.Patient;

public interface PatientService {
	
	List<Patient>getPatient();
	Patient savePatient(Patient patient);
	Boolean deletePatient(Long patientId);
}
