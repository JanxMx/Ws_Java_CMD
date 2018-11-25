package com.jnx.cmd.datastructures.collections.vectors.example_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorDemoAddAll {

    public static void main(String[] args) {
        List arrList = new ArrayList();
        arrList.add(3);
        arrList.add("geeks");
        arrList.add("forgeeks");
        arrList.add(4);

        // createn default vector
        Vector v = new Vector();

        // copying all element of array list into vector
        v.addAll(arrList);

        // checking vector v
        System.out.println("vector v: " + v);
    }

}
