/**
 * Heap Sort is a comparison based sorting technique based on Binary Heap data structure.
 * It's similar to Selection Sort when find the maximum element and it's placed at the end.
 * 
 * Stable:  No
 */
package com.jnx.cmd.sorting.heapsort.example_01;

public class HeapSortII {

    public static void sort(int[] arr) {
        int n = arr.length;

System.out.println("n:" + n);

        // Build heap (rearrange array)
        for(int i=n/2-1; i>=0; i--) {
//System.out.println("for - i:" + i);
            heapify(arr, n, i);
        }

        System.out.print("Builded array:  ");
        printArray(arr);

        // One by one extract an element from heap
        for(int i=n-1; i>=0; i--) {
            
//System.out.println("i2:" + i);

            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

//System.out.println("arr[0]:" + arr[0] + "-arr["+i+"]:" + arr[i]);

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }
        
    // To heapify a subtree with node i which is
    // an index in arr[]. n is size of heap
    static void heapify(int arr[], int n, int i) {

System.out.println("HEAPIFY - n:" + n + " - FOR i:" + i);

        int largest = i;    // Initialize largest as root
        int l = 2*i + 1;    // left = 2*i + 1
        int r = 2*i + 2;    // right = 2*i + 2

System.out.println("largest:" + largest + " -l:" + l + " -n:" + n);
System.out.println("arr["+l+"]:"+arr[l]+"-arr["+largest+"]:"+arr[largest]);
        // If left child is largest than root
        if (l < n && arr[l] > arr[largest]){
//System.out.println("arr["+l+"]:"+arr[l]+"-arr["+largest+"]:"+arr[largest]);
            largest = l;
        }

System.out.println("largest:" + largest + " -r:" + r + " -n:" + n);
//System.out.println("arr["+r+"]:"+arr[r]+"-arr["+largest+"]:"+arr[largest]);
        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest]) {
System.out.println("arr["+r+"]:"+arr[r]+"-arr["+largest+"]:"+arr[largest]);
            largest = r;
        }

//System.out.println("largest:" + largest + "-i:" + i);
        // If largest is not root
        if (largest != i) {
            System.out.println("IF TO SWAP - arr["+i+"] - arr["+largest+"]" + arr[largest]);

            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            System.out.println("IF SWAPPED - arr["+i+"] - arr["+largest+"]" + arr[largest]);

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        } 
    }

    /* A utility to print array of size n */
    static void printArray(int arr[]) {
        int n = arr.length;
        for(int i=0; i<n; ++i)
            System.out.print(arr[i] + ", ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        System.out.print("Original array: ");
        printArray(arr);

        HeapSortII ob = new HeapSortII();
        ob.sort(arr);

        System.out.print("Sorted array:   ");
        printArray(arr);
    }

    
    
} 