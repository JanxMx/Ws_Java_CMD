package com.jnx.cmd.datastructures.collections.vectors.example_01;

import java.util.Vector;

public class VectorDemoEquals {
    
    public static void main(String[] args) {
        
        // creating default vector of capacity 10
        Vector v = new Vector();
        v.add(1);
        v.add(2);
        v.add("geeks");
        v.add("forGeeks");
        v.add(3);

        System.out.println("Vector: " + v);

        // creating default vector of capacity 10
        Vector v_2nd = new Vector();
        v_2nd.add(1);
        v_2nd.add(2);
        v_2nd.add("geeks");
        v_2nd.add("forGeeks");
        v_2nd.add(3);
        
        System.out.println("Vector: " + v_2nd);

        // removing first ocurrance elemnt at 1
        if(v.equals(v_2nd))
            System.out.println("both vectors are equal.");

    }
}