/**
 * Merge Sort is a Divide and Conquer algorithm. 
 * It divides input array in two halves, calls itself for the two halves and then
 * merges the two sorted halves. The merge() function is used for merging two halves.
 *
 * Stable:  ???
 */
package com.jnx.cmd.sorting.mergesort.example_01;

public class MergeSort {

    // Merges two subarrays of arr[]
    // First subarray is arr[1..m]
    // Second subarray is arr[m+1..r]
    static void merge(int arr[], int l, int m, int r) {
        
        // Find sizes of the two arrays to be merged
        int n1 = m-l+1; 
        int n2 = r-m;

        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];

        /* Copy data to temp arrays */
        for(int i=0; i<n1; ++i)
            L[i] = arr[l+i];

        for(int j=0; j<n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i=0, j=0;

        // Initial indexes of merged subarry array
        int k=l;
        while(i<n1 && j<n2) {
            if(L[i] <= R[j]) {
                arr[k] = L[i];
                i++;

                System.out.print("If:   ");
                printArray(arr);
            }else{
                arr[k] = R[j];
                j++;

                System.out.print("Else: ");
                printArray(arr);
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while(i<n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while(j<n2) {
            arr[k] = R[j];
            j++;
            k++;
        }        
    }

    // Main function that sort arr[l..r] using merge()
    static void sort(int arr[], int l, int r) {
        if(l<r) {
            // Find the middle point
            int m = (l+r)/2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m+1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[]) {
        int n = arr.length;
        for(int i=0; i<n; ++i)
            System.out.print(arr[i] + ", ");
        System.out.println();
    }

    // Driven method
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};

        System.out.print("Given Array: ");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length-1);

        System.out.print("\nSorted array: ");
        printArray(arr);
        
    }

}