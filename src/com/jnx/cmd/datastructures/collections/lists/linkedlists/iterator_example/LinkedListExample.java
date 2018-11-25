package com.jnx.cmd.datastructures.collections.lists.linkedlists.iterator_example;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
 
    public static void main(String[] args) {

        List<String> linkedList = new LinkedList<>();
        linkedList.add("John Lennon");
        linkedList.add("Paul McCartney");
        linkedList.add("Jorge Harrison");
        linkedList.add("Ringo Star");

        Iterator itr = linkedList.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Process completed successfully!!");
    }

}
