package com.cisco.organization.controller;

public class Hospital {

    private String patientName;

    private String patientAddress;

    private String patientDisease;

    private int patientRoomno;


    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public String getPatientDisease() {
        return patientDisease;
    }

    public void setPatientDisease(String patientDisease) {
        this.patientDisease = patientDisease;
    }

    public int getPatientRoomno() {
        return patientRoomno;
    }

    public void setPatientRoomno(int patientRoomno) {
        this.patientRoomno = patientRoomno;
    }
}

