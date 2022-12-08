package com.softwareacademy.mediscreen_p9_jb_sprint_3.service;

import com.softwareacademy.mediscreen_p9_jb_sprint_3.constants.Constants;
import org.springframework.stereotype.Service;

@Service
public class RiskFactorsService {

    public int getRiskFactorsCount(List<Notes> patientNotes) {
        int count = 0;
        for(Notes note : patientNotes) {
            String text = note.getNote().toLowerCase();
            count += Constants.riskFactors.stream().filter(riskFactors -> text.contains(riskFactors.toLowerCase())).count();
        }

        return count;
    }

}