/**
 * MapEntry is used to get values
 */
package com.jnx.cmd.datastructures.collections.maps.hashmaps.entrykeys;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {

        Map<String,String> phonebook = new HashMap<>();
        phonebook.put("Navin",   "1122334455");
        phonebook.put("Pooja",   "4523565656");
        phonebook.put("Ali",     "5645545468");
        phonebook.put("Mahesh",  "7824583323");
        phonebook.put("Archana", "4526565666");
        phonebook.put("Kandy",   "5652323556");

        Set<String> keys = phonebook.keySet();

        System.out.println("-------- EntryKeys --------");
        for(String i: keys) {
            System.out.println(i + ":" + phonebook.get(i));
        }

        System.out.println("-------- MapEntry ---------");
        Set<Map.Entry<String,String>> values = phonebook.entrySet();
        for(Map.Entry<String,String> e: values) {
            System.out.println(e.getKey() + ":" + e.getValue());
            e.setValue("III");
        }

    }
}