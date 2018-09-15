package com.jnx.cmd.enums.example_03;

public class Test {
    public static void main(String[] args) {

        double sum = Operation.PLUS.calculate(1, 2);
        System.out.println("Sum             ->  1 + 2 = " + sum); // 3.0

        double substraction = Operation.MINUS.calculate(5, 4);
        System.out.println("Substraction    ->  5 - 4 = " + substraction);

        double multiplication = Operation.TIMES.calculate(6, 5);
        System.out.println("Multiplication  ->  6 * 5 = " + multiplication);

        double division = Operation.DIVIDE.calculate(10, 3);
        System.out.println("Division        -> 10 / 3 = " + division);

    }
}