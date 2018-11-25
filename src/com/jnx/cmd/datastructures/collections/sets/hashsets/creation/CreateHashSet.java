package com.jnx.cmd.datastructures.collections.sets.hashsets.creation;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CreateHashSet {

    public static void main(String[] args) {

        // Create Sets in different ways
        createCars();
        createStringNumbers();
        createNumbers();
        createChocolateSet();

        System.out.println("Process completed successfully");
    }

    // Create a Set with new keyword
    static void createCars() {        
        Set<String> cars = new HashSet<>();
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Audi");
        cars.add("Mercedes Benz");
        cars.add("Audi");

        System.out.println("-------- Cars --------");
        for(String s: cars) 
            System.out.println("car: " + s);
        System.out.println();
    }

    // Create a Set from a list
    static void createStringNumbers() {
        Set<String> strNumbers = new HashSet<>(Arrays.asList("One", "Two", "Three", "Four"));
    
        System.out.println("--------- Text --------");
        for(String s: strNumbers)
            System.out.println("String number: " + s);
        System.out.println();    
    } 

    // Create a Set from a Stream
    static void createNumbers() {
        Integer[] numbers = {1,2,3,4,5,6,7,8,1,2};

        Set<Integer> numberSet = new HashSet<>();
        numberSet = Arrays.stream(numbers).collect(Collectors.toSet());

        System.out.println("------- Numbers -------");
        for(Integer s: numberSet) {
            System.out.println("Numbers: " + s);
        }
        System.out.println();
    }

    // create a Set from an innerClass
    static void createChocolateSet() {
        Set<String> chocolates = new HashSet<String>() {{
            add("Ferrero Roche");
            add("Toublerone");
            add("Carlos V");
            add("Kinder");
            add("Larin");
            add("Kinder");
        }};
            
        System.out.println("------- Chocolates -------");
        for(String s: chocolates) {
            System.out.println("Chocolate: " + s);
        }
        System.out.println();
    }

}