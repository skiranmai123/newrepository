package com.cisco.organization.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Firstapp {

    @Autowired
    private Sumadd a;

    @GetMapping(value = "/get-project",produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> getFirstapp(){
        int addfournumbers=a.getFourNumbers(1,2,2,6);
        return new ResponseEntity<>(addfournumbers, HttpStatus.OK);
    }
}
