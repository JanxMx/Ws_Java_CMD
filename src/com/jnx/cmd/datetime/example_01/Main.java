package com.jnx.cmd.datetime.example_01;

public class Main {

    public static void main(String[] args) {
        DateAndTimeTest dateTimeTest = new DateAndTimeTest();
        dateTimeTest.printLocalDate();
        System.out.println();
        dateTimeTest.printLocalTime();
        System.out.println();
        dateTimeTest.printLocalDateTime();
    }

}