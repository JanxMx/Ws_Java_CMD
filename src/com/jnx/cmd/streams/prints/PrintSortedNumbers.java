package com.jnx.cmd.streams.prints;

import java.util.Random;

public class PrintSortedNumbers {

    public static void main(String[] args) {
        Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);
    }
}