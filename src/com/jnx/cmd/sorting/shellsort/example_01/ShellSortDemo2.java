/**
 * Java implementation of ShellSort
 * Created by Rajat Mishra
 */
package com.jnx.cmd.sorting.shellsort.example_01;

public class ShellSortDemo2 {

    // An utility function to print array of size n
    static void printArray(int arr[]) {
        int n = arr.length;
        for(int i=0; i<n; i++) 
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // function to sort arr using shellsort
    void sort(int arr[]) {
        int n = arr.length;

        // Start with a big gap, then reduce the gap
        for(int gap = n/2; gap>0; gap /= 2) {

            System.out.println("gap:" + gap);
            
            for(int i=gap; i<n; i++) {

                int temp = arr[i];
                System.out.println("gap:" + gap + " -i:" + i + " -arr[" + i + "] -temp:" + temp);

                int j;
                for(j=i; j>=gap && arr[j-gap]>temp; j-=gap) {
                    arr[j] = arr[j-gap];
                    System.out.println("for -> j:" + j + "- j-gap:" + Integer.toString(j-gap));
                }
                System.out.println("j:" + j);

                arr[j] = temp;
                System.out.println("array[j]:" + arr[j]);
                
            }
        }
        //return 0;
    }
    
    // Driver method
    public static void main(String[] args) {
        int arr[] = {12, 34, 54, 2, 3};
        System.out.println("Array before sorting");
        printArray(arr);

        ShellSortDemo2 ob = new ShellSortDemo2();
        ob.sort(arr);

        System.out.println("Array after sorting");
        printArray(arr);
    }

}