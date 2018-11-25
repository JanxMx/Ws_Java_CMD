package com.jnx.cmd.datastructures.collections.vectors.example_01;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemoRetainAll {
    
    public static void main(String[] args) {
        
        Vector v = new Vector(7);
        Vector vecretain = new Vector(4);

        // use add() method to add elements in the vector
        for(int i=1; i<8; i++)
            v.add(i);

        // this elements will be reatined
        vecretain.add(5);
        vecretain.add(3);
        vecretain.add(2);

        System.out.println("Calling retainAll()");
        v.retainAll(vecretain);

        // let us print all the elements available in vector
        System.out.println("Numbers after removal: ");

        Iterator itr = v.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());

    }
}