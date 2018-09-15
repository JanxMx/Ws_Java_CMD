package com.jnx.cmd.interfaces.example_01;

public interface Moveable {

    default void move() {
        System.out.println("I am moving");
    }
}