package com.jnx.cmd.sorting.selectionsort.example_01;

import java.util.Arrays;

public class SelectionSort {

    /**
     * It's a simple sorting algorithm but inefficient for large lists.
     * It swapping the elements (i,j) if they are in wrong order
     *          i, j 
     * It divides the input list into two parts.
     * It find the smallest/largest number and place it at the begginig (each iteration)
     * Time complexity:   0 (n2)
     */
    public static int[] doSelectionSort(int[] arr) {

        System.out.print("iteration - 0:  " );
        printNumbers(arr);

        int iter = 0;
        for(int i=0; i<arr.length-1; i++) {
            int index = i;
            for(int j=i+1; j<arr.length; j++)
                if(arr[j] < arr[index])
                    index = j;
            
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
            System.out.print("iteration - " + ++iter + ":  " );
            printNumbers(arr);
        }
        return arr;
    }

    /**
      * Print the elements of array received 
      */
    private static void printNumbers(int[] input) {
        for (int i=0; i<input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        int[] arr1 = {4, 2, 9, 6, 23, 12, 34, 0, 1};
        int[] arr1b = doSelectionSort(arr1);
        System.out.println("");
        
        int[] arr2 = {10, 34, 2, 56, 7, 67, 88, 42};
        int[] arr2b = doSelectionSort(arr1);

    }
}