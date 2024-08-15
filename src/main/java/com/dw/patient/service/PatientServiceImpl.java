package com.dw.patient.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dw.patient.entity.Patient;

@Service
public class PatientServiceImpl implements PatientService{

	List<Patient> patientList=new ArrayList<>();
	
	@Override
	public List<Patient> getPatient() {
		return patientList;
	}

	@Override
	public Patient savePatient(Patient patient) {
		patientList.add(patient);
		return patient;
	}

	@Override
	public Boolean deletePatient(Long patientId) {
		patientList.removeIf(p->p.getId()==patientId);
		return true;
	}

}
