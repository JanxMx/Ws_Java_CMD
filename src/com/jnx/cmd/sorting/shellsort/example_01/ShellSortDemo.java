/**
 * Java implementation of ShellSort
 * Created by Rajat Mishra
 */
package com.jnx.cmd.sorting.shellsort.example_01;

public class ShellSortDemo {

    // An utility function to print array of size n
    static void printArray(int arr[]) {
        int n = arr.length;
        for(int i=0; i<n; i++) 
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // function to sort arr using shellsort
    int sort(int arr[]) {
        int n = arr.length;

        // Start with a big gap, then reduce the gap
        for(int gap = n/2; gap>0; gap /= 2) {

            System.out.println("gap:" + gap);
            // Do a gapped insertion sort for this gap size.
            // The first gap elements a[0..gap-1] are already
            // in gapped order keep adding one more element
            // until the entire array is gap sorted
            for(int i=gap; i<n; i+=1) {

                // add a[i] to the elements that have been gap
                // sorted save a[i] in temp and make a hole at
                // position i
                int temp = arr[i];
                System.out.println("temp1:" + temp);

                // shift earlier gap-sorted elements up until
                // the correct location for a[i] is found
                int j;
                for(j=i; j>=gap && arr[j-gap]>temp; j-=gap) {
                    arr[j] = arr[j-gap];
                    System.out.println("for -> j:" + j + "-gap:" + gap + "- j-gap:" + Integer.toString(j-gap));
                }
                System.out.println("j:" + j + "-gap:" + gap);

                // put temp (the original a[i]) in its correct
                // location
                arr[j] = temp;
                System.out.println("array[j]:" + arr[j]);
            }
        }
        return 0;
    }
    
    // Driver method
    public static void main(String[] args) {
        int arr[] = {12, 34, 54, 2, 3};
        System.out.println("Array before sorting");
        printArray(arr);

        ShellSortDemo ob = new ShellSortDemo();
        ob.sort(arr);

        System.out.println("Array after sorting");
        printArray(arr);
    }

}