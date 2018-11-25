package com.jnx.cmd.datastructures.collections.vectors.example_01;

import java.util.Vector;

public class VectorDemoRemoveElement {
    
    public static void main(String[] args) {
        
        Vector v = new Vector(7);

        // use add() method to add elements in the vector
        for(int i=1; i<8; i++)
            v.add(i);

        System.out.println("Vector after removal: " + v);

        // remove an element
        v.removeElement(5);

        // checking vector's
        System.out.println("Vector after removal: " + v);

    }
}