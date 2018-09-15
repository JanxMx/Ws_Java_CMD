package com.jnx.cmd.lambdas.tutorialspoint.scope;

public class Java8Tester {

    final static String salutation = "Hello! ";

    public static void main(String[] args) {

        GreetingService greetingService1 = message -> System.out.println(salutation + message);

        greetingService1.sayMessage("Mahesh");
    }

    interface GreetingService {
        void sayMessage(String message);
    }

}