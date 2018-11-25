package com.jnx.cmd.datastructures.collections.vectors.example_01;

import java.util.Vector;

public class VectorDemoEnsureCapacity{
    
    public static void main(String[] args) {
        
        // creating default vector of capacity 10
        Vector v = new Vector();
        System.out.println("Minimum cpacity is: " + v.capacity());

        // ensuring capacity
        v.ensureCapacity(22);

        // checking capacity
        System.out.println("Minimum cpacity is: " + v.capacity());

    }
}