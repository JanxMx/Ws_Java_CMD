package com.jnx.cmd.datastructures.collections.vectors.example_01;

import java.util.Vector;

public class VectorDemoLastIndexOf {
    
    public static void main(String[] args) {
        
        // creating default vector of capacity 10
        Vector v = new Vector();
        v.add(1);
        v.add(2);
        v.add("geeks");
        v.add("forGeeks");
        v.add(3);

        System.out.println("Last ocurrence of 2 is: " + v.lastIndexOf(2));

    }
}