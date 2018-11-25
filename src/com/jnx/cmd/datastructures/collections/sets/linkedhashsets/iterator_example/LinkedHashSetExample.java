package com.jnx.cmd.datastructures.collections.sets.linkedhashsets.iterator_example;

import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Set;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        Set<String> lhs = new LinkedHashSet<>();
        lhs.add("Charlize Theron");
        lhs.add("Shakira");
        lhs.add("Maria Sharapova");
        lhs.add("Scarlett Johansson");
        lhs.add("Amy Adams");

        Iterator itr = lhs.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Process completed successfully!!");
    }

}