package com.jnx.cmd.datastructures.collections.vectors.example_01;

import java.util.Vector;

public class VectorDemoClear {
    
    public static void main(String[] args) {
        
        // creating default vector
        Vector v = new Vector();
        v.add(0, 1);
        v.add(1, 2);
        v.add(2, "geeks");
        v.add(3, "forgeeks");
        v.add(2, 3);

        System.out.println("Vector is: " + v);

        // clearing the vector
        v.clear();

        // checking vector
        System.out.println("after clearing: " + v);
    }
}