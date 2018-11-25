package com.jnx.cmd.sorting.quicksort.creation_01;

public class QuickSortDemo {

    public static void main(String[] args) {

        int[] numbers = {10,8,3,16,5,27,6,0,1,2,3,15};

        System.out.println("------ Original Array -------");
        printNumbers(numbers);

        sort(numbers, 0, numbers.length-1);

        System.out.println("------ Sorted Array --------");
        printNumbers(numbers);        


        System.out.println("Process completed successfully");
    }

    static void sort(int[] numbers, int low, int high) {
        System.out.println("SORT -- low:" + low + " -high:" + high);
        if(low<high) {
            int pi = partition(numbers, low, high);
            sort(numbers, low, pi-1);
            sort(numbers, pi+1, high);
        }
    }

    static int partition(int[] numbers, int low, int high) {
        System.out.println("PIVOT -- low:" + low + " -high:" + high);
        
        int pivot = numbers[high];
        int index = low-1;
        int iter = 0;

        System.out.println("pivot X:" + pivot + " -index:" + index + " -iter:" + iter);

        for(int j=low; j<high; j++) {
            System.out.println("iter:" + iter + " -numbers[j]" + numbers[j] + " < pivot:" + pivot);
            if(numbers[j]<=pivot) {
                System.out.println("entro numbers[j]" + numbers[j] + " < pivot:" + pivot);
                index++;
                int temp = numbers[index];
                numbers[index] = numbers[j];
                numbers[j] = temp;
            }
            System.out.println("INDEX:" + index); 

            System.out.print("for --- ");
            printNumbers(numbers);              
        }

        int temp = numbers[index+1];
        numbers[index+1] = numbers[high];
        numbers[high] = temp;

        printNumbers(numbers);   

        int pi = index+1;
        System.out.println("PI: " + pi);

        return pi;
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