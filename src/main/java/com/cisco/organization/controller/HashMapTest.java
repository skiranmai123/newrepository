package com.cisco.organization.controller;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {
        Map<Integer, String> hashmap = new HashMap<Integer, String>();
        hashmap.put(1, "anu");
        hashmap.put(2, "ammu");
        hashmap.put(3, "honey");
        for (Map.Entry<Integer,String> entry : hashmap.entrySet())
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        for (String i : hashmap.values()) {
            System.out.println(i);


        }
    }
}
