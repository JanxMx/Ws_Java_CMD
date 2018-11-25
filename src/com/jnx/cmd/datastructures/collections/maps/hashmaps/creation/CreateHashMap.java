package com.jnx.cmd.datastructures.collections.maps.hashmaps.creation;

import java.util.HashMap;
import java.util.Map;

public class CreateHashMap {

    public static void main(String[] args) {
        
        // create Maps in different ways
        createCars();
        createChocolateList();

        System.out.println("Process completed successfully!!");
    }

    // create Map with new keyword
    static void createCars() {

        Map<String, String> map = new HashMap<>();
        map.put(null, null);
        map.put("1", "BMW");
        map.put("2", "Audy");
        map.put("3", "Mercedes Benz");
        map.put("4", "Volvo");
        map.put("5", "Toyota"); 

        System.out.println("--------- Cars ---------");
        int len = map.size();
        for(String key: map.keySet()) 
            System.out.println("car - key: " + key + "-" + map.get(key));
        System.out.println();
    }

    // create Map from inner class
    static void createChocolateList() {

        Map<String,String> map = new HashMap<String,String>() {{
            put(null, null);
            put("FR", "Ferrero Roche");
            put("TB", "Toublerone");
            put("KD", "Kinder");
            put("CV", "Carlos V");
            put("LR", "Larin");
        }};

        System.out.println("--------- chocolates ---------");
        for(String key: map.keySet())
            System.out.println("chocolate: " + key + "-" + map.get(key));
        System.out.println();
    }

}