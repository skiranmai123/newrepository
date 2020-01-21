package com.cisco.organization.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sumadd {

    @Autowired
    private Caluculator z;


    public int getFourNumbers(int a,int b, int c, int d)
    {
        int result=z.getTwoNumbers(a,b, c, d);
        return result;
    }


}
