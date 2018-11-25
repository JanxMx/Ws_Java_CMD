package com.jnx.cmd.datastructures.collections.vectors.example_01;

import java.util.Vector;

public class VectorDemoInsertElementAt {
    
    public static void main(String[] args) {
        
        Vector v = new Vector(7);
        
        // use add() method to add elements in the vector
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        v.add(6);
        v.add(7);

        // insert 10 at the index 7
        v.insertElementAt(10, 7);

        // checking vector
        System.out.println("Vector: " + v);

    }
}