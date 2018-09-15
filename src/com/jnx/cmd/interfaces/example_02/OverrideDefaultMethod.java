package com.jnx.cmd.interfaces.example_02;

public class OverrideDefaultMethod implements Vehicle, FourWheeler {

    public void print() {
        System.out.println("I am a four wheeler car vehicle!");
    }
}