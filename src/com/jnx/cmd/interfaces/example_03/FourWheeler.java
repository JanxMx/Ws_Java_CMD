package com.jnx.cmd.interfaces.example_03;

interface FourWheeler {

    default void print() {
        System.out.println("I am a four wheeler");
    }
}