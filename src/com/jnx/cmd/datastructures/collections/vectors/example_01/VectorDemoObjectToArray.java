package com.jnx.cmd.datastructures.collections.vectors.example_01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class VectorDemoObjectToArray {
    
    public static void main(String[] args) {
        
        String[] elements = {"M", "N", "O", "P", "Q"};
        Set set = new HashSet(Arrays.asList(elements));

        String[] strObj = new String[set.size()];

        strObj = (String[]) set.toArray(strObj);

        System.out.println("elements: " + set);
        System.out.println("strObj: " + strObj);

        for(int i=0; i<strObj.length; i++)
            System.out.println(strObj[i]);

        // checking capacity after triming
        System.out.println("set: " + set);
    }
}