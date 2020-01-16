package com.cisco.organization.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
    @GetMapping(value = "/get-endpoint",produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getEndpoint() {
        return new ResponseEntity<>("Hello India",HttpStatus.OK);
    }

}



