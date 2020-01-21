package com.cisco.organization.controller;

public class ExceptionTest {


    public static int test(int a, int b) {
        try {
            int result = a / b;
            return result;
        } catch (Exception e) {
            return 0;
        }

    }


    public static void main(String[] args) {
        System.out.println(test(1, 0));//out put 0
        System.out.println(test(1, 1));//out put 1
    }
}
