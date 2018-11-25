package com.jnx.cmd.datastructures.collections.vectors.example_01;

import java.util.Vector;

public class VectorDemoAdd2 {

    public static void main(String[] args) {
        
        // create default vector
        Vector v = new Vector();

        v.add(0, 1);
        v.add(1, 2);
        v.add(2, "geeks");
        v.add(3, "forGeeks");
        v.add(4, 3);

        System.out.println("Vector is " + v);
    }

}