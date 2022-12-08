package com.softwareacademy.mediscreen_p9_jb_sprint_3.service;

import com.softwareacademy.mediscreen_p9_jb_sprint_3.proxy.PatientHistoryProxy;
import com.softwareacademy.mediscreen_p9_jb_sprint_3.proxy.PatientsHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientHistoryService {
    PatientHistoryProxy proxy;

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
