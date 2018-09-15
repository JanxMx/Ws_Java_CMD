package com.jnx.cmd.enums.example_03;

public class Test2 {

    public static void main(String[] args) {
        
        // enum valueOf + uppercase
        Operation op = Operation.valueOf("times".toUpperCase());
        System.out.println(op.calculate(10, 3));
        
    }

}