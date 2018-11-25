package com.jnx.cmd.datastructures.collections.vectors.example_01;

import java.util.Vector;

public class VectorDemoRemoveAllElements {
    
    public static void main(String[] args) {
        
        Vector v = new Vector(7);

        // use add() method to add elements in the vector
        for(int i=1; i<8; i++)
            v.add(i);

        // remove all elements
        v.removeAllElements();

        // checking vector's size
        System.out.println("Size: " + v.size());

        // checking vector's components
        System.out.println("Vector components: " + v);

    }
}