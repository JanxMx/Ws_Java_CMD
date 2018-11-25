package com.jnx.cmd.datastructures.collections.sets.linkedhashsets.creation;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CreateLHS {

    public static void main(String[] args) {

        // Create LinkedHasSets in different ways
        createCars();
        createStringNumbers();
        createNumbers();
        createChocolateSet();

        System.out.println("Process completed successfully!!");
    }

    // create LHS with new keyword
    static void createCars() {
        Set<String> cars = new LinkedHashSet<>();
        cars.add("Jaguar");
        cars.add("Audi");
        cars.add("Mercedes Benz");
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Mercedes Benz");

        System.out.println("--------- Cars ----------");
        for(String s: cars)
            System.out.println("Car: " + s);
        System.out.println();
    }

    // create a LHS from a list
    static void createStringNumbers() {
        
        Set<String> strNumbers = new LinkedHashSet<>(Arrays.asList("One", "Two", "Three", "Four", "Five"));

        System.out.println("----------- Numbers ----------");
        for(String s: strNumbers)
            System.out.println("Number: " + s);
        System.out.println();
    }

    // create a LHS from a stream
    static void createNumbers() {
        Integer[] numbers = {1,2,3,4,5,6,7,8};

        Set<Integer> numberSet = new LinkedHashSet<>();
        numberSet = Arrays.stream(numbers).collect(Collectors.toSet());

        System.out.println("------ String Numbers -------");
        for(Integer n: numberSet)
            System.out.println("number: " + n);
        System.out.println();
    }

    // create a LHS from an inner class
    static void createChocolateSet() {
        Set<String> chocolates = new LinkedHashSet<String>() {{
            add("Ferrero Roche");
            add("Kinder");
            add("Toublerone");
            add("Carlos V");
            add("Larin");
        }};

        System.out.println("-------- chocolates --------");
        for(String s: chocolates)
            System.out.println("chocolate: " + s);
        System.out.println();
    }

}