package com.jnx.cmd.datastructures.collections.stacks.example_01;

public class Main {

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        System.out.println(stack.pop() + " Popped from stack");
        System.out.println(stack.pop() + " Popped from stack");
        System.out.println(stack.pop() + " Popped from stack");
        System.out.println(stack.pop() + " Popped from stack");
        System.out.println(stack.pop() + " Popped from stack");
        System.out.println(stack.pop() + " Popped from stack");
    }

}