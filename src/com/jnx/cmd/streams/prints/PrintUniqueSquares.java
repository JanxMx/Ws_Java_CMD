package com.jnx.cmd.streams.prints;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class PrintUniqueSquares {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        System.out.println("numbers:     " + numbers);

        // get the list of unique squares
        List<Integer> squaresList = numbers.stream().map(i -> i*i).distinct().collect(Collectors.toList());
        System.out.println("squaresList: " + squaresList);
    }
}