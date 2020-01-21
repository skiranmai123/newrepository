package com.cisco.organization.controller;

public class CheckAge {

    static void myAge(int age){
        if (age<11){
            System.out.println("im 10 years old");
        }
        else {
            System.out.println("im 12 years old");
        }
    }

    public static void main(String[] args) {
        myAge(12);
    }
}
