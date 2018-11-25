package com.jnx.cmd.datastructures.collections.vectors.example_01;

import java.util.Vector;

public class VectorDemoClone {
    
    public static void main(String[] args) {
        
        // creating default vector
        Vector v = new Vector();
        v.add(0, 1);
        v.add(1, 2);
        v.add(2, "geeks");
        v.add(3, "forgeeks");
        v.add(4, 3);
        System.out.println("Vector is: " + v);

        Vector v_clone = new Vector();

        v_clone = (Vector)v.clone();
        // checking vector
        System.out.println("Clone of v: " + v_clone);

    }
}