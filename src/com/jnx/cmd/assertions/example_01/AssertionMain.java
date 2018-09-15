package com.jnx.cmd.assertions.example_01;

import java.io.IOException;
import java.util.Scanner;

public class AssertionMain {

    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = reader.nextInt();
        // Assertion.NDEBUG = false;
        Assertion.assertX(age>=18, "You are too young to vote");
        // use age
        System.out.println("You are elegible to vote");
    }
}