package com.jnx.cmd.datastructures.collections.sets.treesets.iterator_example;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Set;

public class TreeSetExample {

    public static void main(String[] args) {

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Nissan");
        treeSet.add("Toyota");
        treeSet.add("BMW");
        treeSet.add("VW");
        treeSet.add("Mercedes Benz");

        Iterator itr = treeSet.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Process completed successfully!!");
    }
}