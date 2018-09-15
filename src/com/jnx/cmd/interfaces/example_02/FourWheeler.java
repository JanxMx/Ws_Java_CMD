package com.jnx.cmd.interfaces.example_02;

public interface FourWheeler {

    default void print() {
        System.out.println("I am a four wheeler!");
    }
}