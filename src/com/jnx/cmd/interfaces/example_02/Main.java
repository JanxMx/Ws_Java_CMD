package com.jnx.cmd.interfaces.example_02;

public class Main {

    public static void main(String[] args) {

        System.out.println("---- Overriding Default Method ----");
        OverrideDefaultMethod odm = new OverrideDefaultMethod();
        odm.print();

        System.out.println("---- Specify Interface For Default Method ----");
        SpecifyInterfaceForDefaultMethod sifdm = new SpecifyInterfaceForDefaultMethod();
        sifdm.print();
    }

}