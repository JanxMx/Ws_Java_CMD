package com.jnx.cmd.passvalues.example_01;

public class PassValue {

    public static void main(String[] args) {
        Dog aDog = new Dog("Max");
        // we pass the object to foo
        foo(aDog);
        // aDog variable is still pointing to the "Max" dog when foo(...) returns
        aDog.getName().equals("Max");   // true
        aDog.getName().equals("Fifi");  // false
        printResult("main", aDog, "Max");
        printResult("main", aDog, "Fifi");
    }

    public static void foo(Dog d) {
        d.getName().equals("Max");      // true
        printResult("foo method", d, "Max");
        // change d.inside of foo() to point to a new Dog instance "Fifi"
        d = new Dog("Fifi");
        d.getName().equals("Fifi");       // true
        printResult("foo method", d, "Fifi");
    }

    public static void printResult(String source, Dog d, String name) {
        System.out.println(source + " - " + name + ": " + d.getName().equals(name));
    }

}

class Dog {
    
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
