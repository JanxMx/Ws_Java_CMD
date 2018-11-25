package com.jnx.cmd.datastructures.collections.vectors.example_01;

import java.util.Vector;

public class VectorDemoContains{
    
    public static void main(String[] args) {
        
        // creating default vector
        Vector v = new Vector();
        v.add(0, 1);
        v.add(1, 2);
        v.add(2, "geeks");
        v.add(3, "forGeeks");
        v.add(4, 3);
        System.out.println("Vector is: " + v);

        // check whether vector contains "forGeeks"
        if(v.contains("forGeeks"))
            System.out.println("forGeeks exists");

    }
}