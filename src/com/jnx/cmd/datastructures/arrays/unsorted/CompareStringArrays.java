package com.jnx.cmd.datastructures.arrays.unsorted;

import java.util.Arrays;

public class CompareStringArrays {

    CompareStringArrays() {}

    public boolean compareStringArrays(String[] arr1, String[] arr2) {
        if(arr1.length != arr2.length)
            return false;

        String[] arr1Copy = arr1.clone();
        String[] arr2Copy = arr2.clone();

        Arrays.sort(arr1Copy);
        Arrays.sort(arr2Copy);

        for(int i=0; i<arr1Copy.length; i++) {
            if(!arr1Copy[i].equals(arr2Copy[i]))
                return false;
        }
        return true;
    }

}