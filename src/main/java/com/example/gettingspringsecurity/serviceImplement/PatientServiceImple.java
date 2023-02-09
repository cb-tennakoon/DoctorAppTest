package com.example.gettingspringsecurity.serviceImplement;

import com.example.gettingspringsecurity.entity.Patient;
import com.example.gettingspringsecurity.repository.PatientInfoRepository;
import com.example.gettingspringsecurity.service.PatientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImple implements PatientService {
    private final PatientInfoRepository patientInfoRepository;

    public PatientServiceImple(PatientInfoRepository patientInfoRepository){
        super();
        this.patientInfoRepository = patientInfoRepository;
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientInfoRepository.save(patient);
    }

    public List<Patient> listAll(String keyword) {
        if (keyword != null) {
            return patientInfoRepository.search(keyword);
        }
        return patientInfoRepository.findAll();
    }
}
