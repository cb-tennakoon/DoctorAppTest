package com.example.doctorAppTest.serviceImplement;

import com.example.doctorAppTest.entity.Patient;
import com.example.doctorAppTest.repository.PatientInfoRepository;
import com.example.doctorAppTest.service.PatientService;
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
