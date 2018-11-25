package com.jnx.cmd.datastructures.collections.vectors.example_01;

import java.util.Vector;

public class VectorDemoIndexOf{
    
    public static void main(String[] args) {
        
        // creating default vector of capacity 10
        Vector v = new Vector();
        v.add(1);
        v.add(2);
        v.add("geeks");
        v.add("forGeeks");
        v.add(3);

        // get element at index 2
        System.out.println("Index of geeks is: " + v.indexOf("geeks"));

    }
}