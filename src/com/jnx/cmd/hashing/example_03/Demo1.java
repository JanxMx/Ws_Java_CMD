/**
 * Differences between hashcode() and equals()
 */
package com.jnx.cmd.hashing.example_03;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {

    public static void main (String[] args) {

        Employee1 emp1 = new Employee1(1);
        Employee1 emp2 = new Employee1(1);

        Map<Employee1, String> map = new HashMap<>();
        map.put(emp1, "Jack");
        map.put(emp2, "Jack");

        System.out.println(map.size());     // guess it 2
        
        System.out.println(map.entrySet());

        Integer i = new Integer(1);
        Integer i1 = new Integer(1);

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(i, "one");
        map1.put(i1, "one");

        System.out.println(map1.size());    // guess it 1
    }
}

class Employee1 {
    int id;

    public Employee1(int id) {
        this.id = id;
    }
}