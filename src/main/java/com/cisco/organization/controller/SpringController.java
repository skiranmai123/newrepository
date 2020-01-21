package com.cisco.organization.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SpringController {

    @GetMapping(value = "/get-application", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List> getDetails() {



        List list1 =new ArrayList();
        list1.add("chinnu");
        list1.add(1233);
        list1.add("abcd");

        for(int i=0;i<list1.size();i++)
        {
            System.out.println(list1.get(i));
        }


        return new ResponseEntity<>(list1, HttpStatus.OK);

    }
}