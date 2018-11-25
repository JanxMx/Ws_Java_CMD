package com.jnx.cmd.datastructures.collections.maps.hashmaps.example_01;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        Map<String, Integer> vehicles = new HashMap<>();

        vehicles.put("BMW", 5);
        vehicles.put("Toyota", 8);
        vehicles.put("VW", 3);
        vehicles.put("Nissan", 6);
        vehicles.put("Mazda", 7);
        vehicles.put("Audi", 4);

        System.out.println("Total vehicles: " + vehicles.size());

        // Iterate over all vehicles, using the KeySet method
        for(String key: vehicles.keySet())
            System.out.println(key + "-" + vehicles.get(key));
        System.out.println();

        String searchKey = "Audi";
        if(vehicles.containsKey(searchKey))
            System.out.println("Found total: " + vehicles.get(searchKey) + 
                " " + searchKey + "\n cars!\n");

        // Clear all values
        vehicles.clear();

        // Equals to zero
        System.out.println("After clear operation, size: " + vehicles.size());
    }

}