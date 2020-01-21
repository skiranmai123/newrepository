package com.cisco.organization.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<String, String> hashmap = new HashMap<String, String>();
        hashmap.put("chinnu", "minnu");
        hashmap.put("chinnu", "minnu");
        hashmap.put("chitti", "chinni");
        hashmap.put("pinky", "monkey");
        hashmap.remove("chitti");
        for (String i : hashmap.keySet()) {
            System.out.println(i);
        }
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(8);
        arrayList.add(7);
        arrayList.add(6);
        for (Integer i : arrayList) {
            System.out.println(i);

        }

        List<String> list = new ArrayList<>();
        list.add("suram");
        list.add("srinivas");
        list.add("ramana");
        list.add("chinnu");
        list.add("srikanth");
        System.out.println(list.get(3));
        for(String s:list){
            if(s.contains("s")){
                System.out.println("words contain s:"+s);
            }

        }

    }
}