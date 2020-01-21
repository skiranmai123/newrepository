package com.cisco.organization.controller;

public class TestArray {

    public static void main(String[] args) {
        int sum=0;
        int[] myList={1,2,3};
        for(int i=0;i<myList.length;i++){
            sum=sum+myList[i];

            System.out.println(myList[i]+"");
        }
        System.out.println(sum);
        }
        }