package com.jnx.cmd.datastructures.collections.maps.hashtables.example_01;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

    public static void main(String[] args) {

        Map<String, Integer> vehicles = new Hashtable<>(); 

        vehicles.put("BMW", 5);
        vehicles.put("Toyota", 8);
        vehicles.put("VW", 3);
        vehicles.put("Nissan", 6);
        vehicles.put("Mazda", 7);
        vehicles.put("Audi", 4);

        System.out.println("Total vehicles: " + vehicles.size());

        for(String key: vehicles.keySet()) {
            System.out.println(key + " " + vehicles.get(key));
        }
        System.out.println();

        String searchKey = "Audi";
        if (vehicles.containsKey(searchKey))
            System.out.println("Found total " + 
                vehicles.get(searchKey) + " " +
                searchKey + " cars!\n");
        
        // Clear all Cars
        vehicles.clear();

        // Equals to zero
        System.out.println("After clear operation, size: " + vehicles.size());

        // The next statement throw a NullPointerException, if uncommented.
        // vehicles.put("Ford", null);
        // vehicles.put(null, 9) 

    }

}