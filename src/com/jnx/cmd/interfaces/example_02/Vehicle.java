package com.jnx.cmd.interfaces.example_02;

public interface Vehicle {

    default void print() {
        System.out.println("I am a vehicle!");
    }
}