package com.softwareacademy.mediscreen_p9_jb_sprint_3.proxy;


import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "mediscreen-sprint-1", url = "localhost:8081")
public interface PatientProxy {

    @GetMapping("/patient?firstName={firstName}&lastName={lastName}")
    //@Headers("Content-Type: application/json")
    Patient getPatientByName(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName);

    @GetMapping("/patients")
    List<Patient> getAllPatients();

}
