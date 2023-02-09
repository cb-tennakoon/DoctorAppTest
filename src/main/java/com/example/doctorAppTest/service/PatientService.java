package com.example.doctorAppTest.service;

import com.example.doctorAppTest.entity.Patient;

import java.util.List;

public interface PatientService {
    Patient savePatient(Patient patient);
    List<Patient> listAll(String keyword);
}
