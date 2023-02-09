package com.example.gettingspringsecurity.service;

import com.example.gettingspringsecurity.entity.Patient;

import java.util.List;

public interface PatientService {
    Patient savePatient(Patient patient);
    List<Patient> listAll(String keyword);
}
