package com.jnx.cmd.sorting.shellsort.creation_01;

public class ShellSortDemo {

    public static void main(String[] args) {

        int[] numbers = {10,8,3,16,5,27,6,0,1,2,3,15};

        System.out.println("------ Original Array -------");
        printNumbers(numbers);

        sortNumbers(numbers);

        System.out.println("------ Sorted Array --------");
        printNumbers(numbers);

        System.out.println("Process completed successfully!!");
    }

    static void sortNumbers(int[] numbers) {
        
        int len = numbers.length;
        if(len==0)
            return;
        
        // define gap size from bigger to zero
        for(int gap=len/2; gap>0; gap/=2) {
            // move between gaps start from 1st
            for(int i=gap; i<len; i++) {
                int temp= numbers[i];
                int j;
                // move end to left to place in right position
                for(j=i; j>=gap && numbers[j-gap]>temp; j-=gap) {
                    numbers[j] = numbers[j-gap];
                }
                numbers[j] = temp;
            }
        }
    }

    static void printNumbers(int[] numbers) {
        int len = numbers.length;
        if(len==0)
            return;
        for(int i=0; i<len; i++) { 
            if(i>0)
                System.out.print(", ");
            System.out.print(numbers[i]);
        }
        System.out.println();
    }
}