package com.jnx.cmd.datastructures.collections.sets.hashsets.iterator_example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        hashSet.add("Java");
        hashSet.add("Javascript");
        hashSet.add("HTML5");
        hashSet.add("CSS3");
        hashSet.add("JSON");

        Iterator itr = hashSet.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Process completed successfully!!");
    }

}
