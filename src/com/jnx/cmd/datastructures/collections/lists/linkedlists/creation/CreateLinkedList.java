package com.jnx.cmd.datastructures.collections.lists.linkedlists.creation;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CreateLinkedList {

    public static void main(String[] args) {

        // Create LinkedLists in different ways
        createCarList();
        createNumberList();
        createChocolateList();
        createSingleList();

        System.out.println("Process completed successfully!!");
    }

    // create LinkedList with new keyword
    static void createCarList() {

        List<String> cars = new LinkedList<>();
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Mercedes Benz");
        cars.add("VW");
        cars.add("Audi");
        cars.add("Audi");
        cars.add("Mercedes Benz");

        System.out.println("----------- Cars -----------");
        for(String s: cars)
            System.out.println("car: " + s);
        System.out.println();
    }

    // create a LinkedList from a List
    static void createNumberList() {
        List<Integer> numbers = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7));

        System.out.println("--------- numbers ----------");
        for(int i=0; i<numbers.size(); i++) 
            System.out.println("numbers:" + numbers.get(i));
        System.out.println();
    }

    // create a LinkedList from an innner class
    static void createChocolateList() {
        List<String> chocolates = new LinkedList<String>() {{
            add("Ferrero Roche");
            add("Kinder");
            add("Carlos V");
            add("Toublerone");
        }};

        System.out.println("-------- chocolates -------- ");
        for(String s: chocolates)
            System.out.println("chocolate: " + s);
        System.out.println();
    }

    // create an abstract list from one element
    static void createSingleList() {
        List<String> single = Collections.singletonList("one element");
        
        try {
            single.add("two elements");
        }catch(UnsupportedOperationException e) {
            e.printStackTrace();
        }finally{
            System.out.println("Error on insertion...");
        }   

        
        System.out.println("---------- single ----------- ");
        for(String s: single)
            System.out.println("single:" + single);
        System.out.println();
    }




} 