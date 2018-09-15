package com.jnx.cmd.mains.twomains;

public class MyClass2 {

    public static void main(String[] args) {
        System.out.println("main() method of MyClass2...");
        OtherClass ob = new OtherClass();
    }
}

class OtherClass {

    public OtherClass() {
        System.out.println("Other Class...");
    }

}