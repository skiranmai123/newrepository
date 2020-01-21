package com.cisco.organization.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLOutput;

@RestController
public class ProjectController {

   @Autowired
   private Caluculator a;

    @GetMapping(value = "/get-endpoint",produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SampleResponse> getendpoint()  {
        int result = a.getTwoNumbers(1,2,8,9);
        float test =10;
    // int result1 = 1/0;

        Employee e = new Employee("Rishanth", "suram", 10);
        e.setRollNumber(20);
        Hospital h= new Hospital();
        h.setPatientAddress("hyd");
        h.setPatientDisease("fever");
        h.setPatientRoomno(1);
        College c= new College();
        c.setStudentBranch("cse");
        c.setStudentDob("01-02-1988");
        c.setStudentName("chitti");
        System.out.println(c.getStudentAddress());
        System.out.println(h.getPatientDisease());
        System.out.println(e.getLastName());
        SampleResponse response =  new SampleResponse();
        response.setCollege(c);
        response.setHospital(h);

        return new ResponseEntity<>(response,HttpStatus.OK);

    }



}



