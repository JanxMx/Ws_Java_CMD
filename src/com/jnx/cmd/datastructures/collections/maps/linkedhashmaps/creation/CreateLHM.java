package com.jnx.cmd.datastructures.collections.maps.linkedhashmaps.creation;

import java.util.Map;
import java.util.LinkedHashMap;

public class CreateLHM {

    public static void main(String[] args) {

        // create LHM in different ways
        createCars();
        createChocolateList();

        System.out.println("Process completed successfully!!");
    }

    // create LHM with new keyword
    static void createCars() {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("1", "BMW");
        map.put("2", "Mercedes Benz");
        map.put("3", "Audi");
        map.put("4", "Jaguar");
        map.put("5", "Toyota");

        System.out.println("------- cars --------");
        for(String key: map.keySet())
            System.out.println("Car: " + key + "-" + map.get(key));
        System.out.println();    
    }

    // create LHM form inner class
    static void createChocolateList() {
        Map<String,String> map = new LinkedHashMap<String,String>() {{
            put("FR","Ferrero Roche");
            put("KD","Kinder");
            put("TB", "Toublerone");
            put("", "");
            put(null, null);
        }};

        System.out.println("-------- chocolates --------");
        for(String key: map.keySet())
            System.out.println("chocolate: " + key + "-" + map.get(key));
        System.out.println();

    }

}