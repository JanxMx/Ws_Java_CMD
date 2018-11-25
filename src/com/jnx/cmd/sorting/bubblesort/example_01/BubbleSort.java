package com.jnx.cmd.sorting.bubblesort.example_01;

public class BubbleSort {
    
    /**
     * Is the simplest sorting algorithm but the most inefficient
     * It swapping the adjacent elements if they are in wrong order
     *          i, i+1 
     * It find the biggest number and place it at the end (each iteration)
     * Best time complexity:    0(n)
     * Worst time complexity:   0 (n*n)
     * Stable:  Yes
     */
    public static void bubble_srt(int[] array) {

        System.out.print("iteration - 0:   " );
        printNumbers(array);

        int n = array.length;
        int k;
        int iter = 0;

        for(int m=n; m>=0; m--) {
            for(int i = 0; i < n-1; i++) {
                k = i+1;
                if(array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
            }
            System.out.print("Iteration - " + ++iter + ":   ");
            printNumbers(array);
        }
    }

    /**
      * Switch the elements of the array (array)
      */
    private static void swapNumbers(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
      * Print the elements of array received 
      */
    private static void printNumbers(int[] input) {
        int len = input.length;
        for (int i=0; i<len; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
 
        int[] arr1 = {4, 2, 9, 6, 23, 12, 34, 0, 1};

        bubble_srt(arr1);
        System.out.println("");

        int[] arr2 = {10, 34, 2, 56, 7, 67, 88, 42};
        bubble_srt(arr2);
    }

}