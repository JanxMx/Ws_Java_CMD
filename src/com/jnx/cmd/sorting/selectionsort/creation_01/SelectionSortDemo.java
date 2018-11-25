package com.jnx.cmd.sorting.selectionsort.creation_01;

public class SelectionSortDemo {

    public static void main(String[] args) {

        int[] numbers = {10,8,3,16,5,27,6,0,1,2,3,15};

        System.out.println("-------- Original Array --------");
        printNumbers(numbers);

        sortNumbers(numbers);

        System.out.println("-------- Sorted Array --------");
        printNumbers(numbers);

        System.out.println("Process completed succesfully!!");
    }

    static void sortNumbers(int[] numbers) {
        int len = numbers.length; 
        if(len==0)
            return;

        int index = 0;

        for(int i=0; i<len-1; i++) {
            for(int j=i+1; j<len; j++) {
                if(numbers[j] < numbers[index] )
                    index = j;
            }

            if(index > i) {
                int temp = numbers[i];
                numbers[i] = numbers[index];
                numbers[index] = temp;
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