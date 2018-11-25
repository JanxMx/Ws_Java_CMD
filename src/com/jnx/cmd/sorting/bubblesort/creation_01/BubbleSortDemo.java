package com.jnx.cmd.sorting.bubblesort.creation_01;

public class BubbleSortDemo {

    public static void main(String[] args) {

        int[] numbers = {10,8,3,16,5,27,6,0,1,2,3,15};

        System.out.println("-------- Original Array --------");
        printNumbers(numbers);

        sortNumbers(numbers); 

        System.out.println("-------- Ordered Array --------");
        printNumbers(numbers);

        System.out.println("Process completed successfully!!");
    }

    static void sortNumbers(int[] numbers) {
        int len = numbers.length-1;
        if(len==0)
            return;

        int[] result = new int[len];
        for(int i=len; i>0; i--) {
            for(int j=0; j<len; j++) {
                if(numbers[j]>numbers[j+1]) {
                    int temp = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

    }

    static void printNumbers(int[] numbers) {
        int len = numbers.length;

        for(int i=0; i<len; i++) {
            if(i>0)
                System.out.print(", ");
            System.out.print(numbers[i]);
        }
        System.out.println();
    }

}