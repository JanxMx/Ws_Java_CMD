package com.jnx.cmd.datastructures.collections.vectors.example_01;

import java.util.Vector;

public class VectorDemoSize {
    
    public static void main(String[] args) {
        
        // creating default vector of capacity 10
        Vector v = new Vector();
        v.add(1);
        v.add(2);
        v.add("geeks");
        v.add("forGeeks");
        v.add(3);

        // initial size of vector
        System.out.println("size of vector: " + v.size());

        // increase vector capacity
        v.setSize(13);

        // size of vector
        System.out.println("size of vector: " + v.size());
    }
}