package com.jnx.cmd.datastructures.collections.vectors.example_01;

import java.util.Vector;

public class VectorDemoCopyInto {
    
    public static void main(String[] args) {
        
        Vector v = new Vector(7);

        // use add() method to add elements in the vector
        for(int i=1; i<8; i++)
            v.add(i);

        Integer[] arr = new Integer[7];

        // copy component of vector int array arr
        v.copyInto(arr);

        System.out.println("Elements in the arr: ");
        for(Integer num: arr)
            System.out.println("Array: " + num);

    }
}