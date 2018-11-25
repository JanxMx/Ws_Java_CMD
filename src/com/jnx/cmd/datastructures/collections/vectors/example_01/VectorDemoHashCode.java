package com.jnx.cmd.datastructures.collections.vectors.example_01;

import java.util.Vector;

public class VectorDemoHashCode {
    
    public static void main(String[] args) {
        
        Vector v = new Vector(7);

        // use add() method to add elements in the vector
        for(int i=1; i<8; i++)
            v.add(i);

        // checking last element of vector
        System.out.println("Vector's hash code: " + v.hashCode());
    }
}