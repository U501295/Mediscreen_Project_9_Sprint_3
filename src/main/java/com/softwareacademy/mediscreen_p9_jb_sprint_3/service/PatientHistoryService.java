package com.softwareacademy.mediscreen_p9_jb_sprint_3.service;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class PatientHistoryService {
    PatientHistoryProxy proxy;

    @Autowired
    private PatientHistoryService(PatientHistoryProxy patientHistoryProxy) {
        proxy = patientHistoryProxy;
    }

    public List<PatientsHistory> getAllPatientsHistories() {
        return proxy.getAllPatientsHistories();

    }

    public PatientsHistory getPatientsHistoryByName(String firstName, String lastName) {
        return proxy.getPatientHistoryByName(firstName, lastName);
    }

    public PatientsHistory getPatientsHistoryById(Long id) {
        return proxy.getPatientHistoryById(id);
    }
}
