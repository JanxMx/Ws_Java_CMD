package com.jnx.cmd.streams.prints;

import java.util.Random;

public class PrintRandomNumbers {
    
    public static void main(String[] args) {    
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
    }
}