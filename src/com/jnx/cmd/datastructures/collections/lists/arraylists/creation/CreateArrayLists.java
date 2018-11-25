package com.jnx.cmd.datastructures.collections.lists.arraylists.creation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CreateArrayLists {

    public static void main(String[] args) {

        // Create ArrayList in different ways 
        createCarList();
        createNumberList();
        createChocolateList();
        createSingleList();

        System.out.println("Process completed successfully!!");
    }

    // create ArrayList with new keyword
    static void createCarList() {

        List<String> cars = new ArrayList<>();     // created automatically of 10
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Nissan");
        cars.add("BMW");
        cars.add("Mercedes Benz");
        cars.add("BMW");
        
        int len = cars.size(); 
        System.out.println("------------ Cars -----------");
        for(int i=0; i<len; i++)
            System.out.println("Car " + i + " - " + cars.get(i));

        System.out.println();
    }

    // create ArrayList from an Array
    static void createNumberList() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
 
        System.out.println("---------- Numbers ---------");
        for(Integer i: numbers)
            System.out.println("Numbers: " + i);

        System.out.println();
    }

    // create ArrayList from an anonymous inner class
    static void createChocolateList() {
        //List<String> chocolates = new ArrayList<>() {{    // Invalid for anonymous class
        List<String> chocolates = new ArrayList<String>() {{
            add("Toblerone");
            add("Ferrero Rocher");
            add("Carlos V");
            add("Larin");
        }};

        System.out.println("--------- Chocolates --------");
        for(String s: chocolates)
            System.out.println("Chocolate: " + s);

        System.out.println();
    }

    // create a list for one element
    static void createSingleList() {
        List<String> single = Collections.singletonList("one element");
        
        try{
            single.add("other");
        }catch(UnsupportedOperationException e){
            e.printStackTrace();
        }finally{
            System.out.println("Error on insertion...");
        }

        System.out.println("----------- Single ----------");
        for(String s: single)
            System.out.println("single: " + s);

        System.out.println();
    }
}