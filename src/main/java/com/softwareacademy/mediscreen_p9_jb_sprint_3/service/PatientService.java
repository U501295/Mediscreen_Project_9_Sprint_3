package com.softwareacademy.mediscreen_p9_jb_sprint_3.service;

import com.softwareacademy.mediscreen_p9_jb_sprint_3.proxy.Patient;
import com.softwareacademy.mediscreen_p9_jb_sprint_3.proxy.PatientProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    PatientProxy proxy;

    @Autowired
    public PatientService(PatientProxy patientProxy) {
        proxy = patientProxy;
    }

    public List<Patient> getAllPatients() {
        return proxy.getAllPatients();
    }

    public Patient getPatientByName(String firstName, String lastName) {
        return proxy.getPatientByName(firstName, lastName);
    }
}
