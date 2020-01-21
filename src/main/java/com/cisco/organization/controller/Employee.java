package com.cisco.organization.controller;



public class Employee {

    private String firstName;

    private String lastName;

    private int rollNumber;


    public Employee(String first, String last, int number){
        this.firstName = first;
        this.lastName = last;
        this.rollNumber = number;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }



    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}
