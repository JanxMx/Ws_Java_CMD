package com.jnx.cmd.datastructures.arrays.creation;

public class CreateArrays {

    // Create array with new keyword
    static void createIntArray1() {
        int[] arr1 = new int[10];
        for(int i=0; i<arr1.length; i++)
            arr1[i] = 10 + i;

        int pos = 0;
        for(int i: arr1)
            System.out.println("arr1[" + pos++ + "]: " + i);
        
        System.out.println();
    }

    // Create array from int values
    static void createIntArray2() {
        Integer[] arr2 = {21,22,23,24,25,26};

        for(int i=0; i<arr2.length; i++)
            System.out.println("arr2[" + i + "]: " + arr2[i]);

        System.out.println();
    }

    // create array with new keyword
    static void createStrArray1() {
        String[] strArray = new String[10];
        int len = strArray.length;

        for(int i=0; i<len; i++)
            strArray[i] = "Value " + (i+1); 

        for(int i2=0; i2<len; i2++) 
            System.out.println("strArra1[" +  i2 + "]: " + strArray[i2]);
    
        System.out.println();
    }


    // Create array from string values
    static void createStrArray2() {
        String[] strArray = {"one", "two", "tree", "four", "five", "six", "seven", "eight", "nine", "ten"};
    
        int pos = 0;
        for(String s: strArray)
            System.out.println("strArr2[" + pos++ + "]: " + s);
    }

    public static void main(String[] args) {

        // Create Arrays
        createIntArray1();
        createIntArray2();
        createStrArray1();
        createStrArray2();
    }

}