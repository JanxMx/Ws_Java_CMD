package com.jnx.cmd.datastructures.arrays.unsorted;

import java.util.Arrays;

public class CompareArraysUnsorted {

    public static void main(String[] args) {
        
        String[] arr1 = new String[] {"one", "two", "three", "four", "five"};
        String[] arr2 = new String[] {"zero", "two", "four", "six", "eight"};
        String[] arr3 = new String[] {"one", "five", "two", "three", "four"};
        String[] arr4 = new String[] {"one", "two", "three", "four", "five"};
        String[] arr5 = new String[] {"one", "two", "three", "four", "five", "six"};

        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
        System.out.println("arr3: " + Arrays.toString(arr3));
        System.out.println("arr4: " + Arrays.toString(arr4));
        System.out.println("arr5: " + Arrays.toString(arr5));

        CompareStringArrays compArrays = new CompareStringArrays();

        boolean test1 = compArrays.compareStringArrays(arr1, arr2);
        System.out.println("arr1 = arr2: " + test1);
        
        boolean test2 = compArrays.compareStringArrays(arr2, arr3);
        System.out.println("arr2 = arr3: " + test2);

        boolean test3 = compArrays.compareStringArrays(arr1, arr3);
        System.out.println("arr1 = arr3: " + test3);

        boolean test4 = compArrays.compareStringArrays(arr1, arr4);
        System.out.println("arr1 = arr4: " + test4);

        boolean test5 = compArrays.compareStringArrays(arr4, arr5);
        System.out.println("arr4 = arr5: " + test5);

    }

}