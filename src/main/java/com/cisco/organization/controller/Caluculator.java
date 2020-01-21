package com.cisco.organization.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Caluculator {
    private  static Caluculator caluculator;


    private Caluculator(){

    }
    @Autowired
    private Addition ad;

    public static Caluculator getInstance() {
        if(caluculator == null){
            caluculator = new Caluculator();
        }
        return caluculator;

    }


    public int getTwoNumbers(int a, int b, int c, int d) {
        int result = ad.getTwoNumbers(a,b, c, d);
        return result;
    }
}

