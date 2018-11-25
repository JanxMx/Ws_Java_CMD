package com.jnx.cmd.sorting.quicksort.example_01;

public class QuickSort {

    /**
     * This method takes last element as pivot, places the pivot element at its correct position
     * in sorted array, and places all smaller (smaller than pivot) to left of pivot and 
     * all greater elements to right of the pivot.
     *
     * Stable:  Usually not (most implementations are not stable)
     */
    private static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        int iter = 0;

        for(int j=low; j<high; j++) {
            // If current element is smaller than or equal to pivot
            if(arr[j] <= pivot) {       // validar si funciona sólo con el = !!!!!!!!
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } 
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        int pi = i+1;

        return pi;
    }

    /**
     * The main function that implements QuickSort() 
     * arr[] --> array to be sorted,
     * low --> Starting index,
     * high --> Ending index
     */
    private static void sort(int arr[], int low, int high) {
        
        if(low < high) {
            /* pi is partitioning index arr[pi] is now at right place */
            int pi = partition(arr, low, high);

            // recursively sort elements before partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);

            printArray(arr);            
        }
    }

    /**
      * Print the elements of array received 
      */
    private static void printArray(int[] array) {
        int n = array.length;
        for (int i=0; i<n; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QuickSort sorter =  new QuickSort();

        int[] arr1 = {4, 2, 9, 6, 23, 12, 34, 0, 1};
        int len1 = arr1.length;
        System.out.print("iteration - 0:   " );
        printArray(arr1);        
        sorter.sort(arr1, 0, len1-1);

        /*
        int[] arr2 = {10, 34, 2, 56, 7, 67, 88, 42};
        int len2 = arr2.length;
        System.out.print("iteration - 0:   " );
        printArray(arr2);
        sorter.sort(arr2, 0, len2-1);
        System.out.println("");

        int[] arr3 = {24, 2, 45, 20, 56, 75, 2 };
        int len3 = arr3.length;
        System.out.print("iteration - 0:   " );
        printArray(arr3);
        sorter.sort(arr3, 0, len3-1);
        */
    }
}