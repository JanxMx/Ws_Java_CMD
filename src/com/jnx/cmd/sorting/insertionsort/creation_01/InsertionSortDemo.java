package com.jnx.cmd.sorting.insertionsort.creation_01;

public class InsertionSortDemo {

    public static void main(String[] args) {

        int[] numbers = {10,8,3,16,5,27,6,0,1,2,3,15};

        System.out.println("-------- Original Array --------");
        printNumbers(numbers);

        sortNumbers(numbers);

        System.out.println("-------- Orderer Array --------");
        printNumbers(numbers);
    }

    static void sortNumbers(int[] numbers) {
        int len = numbers.length;
        if(len==0)
            return;
        
        int key;
        int j;        
        int temp;
        for(int i=1; i<len; i++) {
            key = numbers[i];
            j = i-1;
            while(j>=0 && key<numbers[j]) {   // move key to right position 
                numbers[j+1] = numbers[j];     
                --j;
            }  
            numbers[j+1] = key;
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