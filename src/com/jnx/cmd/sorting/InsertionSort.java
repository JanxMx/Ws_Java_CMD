package com.jnx.cmd.sorting;

public class InsertionSort {

    /**
     * It's a simple sorting algorithm but inefficient for large lists.
     * It swapping the elements that are greater than key to one position ahead of their current position.
     *          j, j+1 
     * It moves the key and place it at the right position
     * Time complexity:     0 (n*n)
     * Stable:  Yes
     */
    public static void doInsertionSort(int[] arr) {

        System.out.print("iteration - 0:   " );
        printNumbers(arr);

        int n = arr.length;
        for(int i=1; i<n; ++i) {
            int key = arr[i];
            int j = i-1;

            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead
               of their current position */
            while (j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;

            System.out.print("Iteration - " + i + ":   ");
            printNumbers(arr);            
        }

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
        doInsertionSort(arr1);
        System.out.println("");

        int[] arr2 = {10, 34, 2, 56, 7, 67, 88, 42};
        doInsertionSort(arr2);

    }

}