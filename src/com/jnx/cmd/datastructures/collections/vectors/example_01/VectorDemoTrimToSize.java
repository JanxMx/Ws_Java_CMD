package com.jnx.cmd.datastructures.collections.vectors.example_01;

import java.util.Vector;

public class VectorDemoTrimToSize {
    
    public static void main(String[] args) {
        
        // creating default vector of capacity 10
        Vector v = new Vector();
        v.add(1);
        v.add(2);
        v.add("geeks");
        v.add("forGeeks");
        v.add(3);

        System.out.println("vector: " + v);

        // checking initial capacity
        System.out.println("Initial capacity: " + v.capacity());

        // trim capacity to size
        v.trimToSize();

        // checking capacity after triming
        System.out.println("capacity after triming: " + v.capacity());

    }
}