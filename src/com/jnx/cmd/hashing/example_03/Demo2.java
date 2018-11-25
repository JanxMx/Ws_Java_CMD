/**
 * Differences between hashcode() and equals()
 */
package com.jnx.cmd.hashing.example_03;

import java.util.HashMap;
import java.util.Map;

public class Demo2 {

    public static void main (String[] args) {

        Employee2 emp1 = new Employee2(1);
        Employee2 emp2 = new Employee2(1);

        Map<Employee2, String> map = new HashMap<>();
        map.put(emp1, "Jack");
        map.put(emp1, "Jack");

        System.out.println(map.size());     // guess it 1

        System.out.println(map.entrySet());

        Integer i = new Integer(1);
        Integer i1 = new Integer(1);

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(i, "one");
        map1.put(i1, "one");

        System.out.println(map1.size());    // guess it 1
    }
}

class Employee2 {
    int id;

    public Employee2(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) 
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Employee2 other = (Employee2) obj;
        if(id != other.id)
            return false;
        return true;
    }
}