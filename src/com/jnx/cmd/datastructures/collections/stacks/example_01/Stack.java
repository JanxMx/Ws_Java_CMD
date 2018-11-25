package com.jnx.cmd.datastructures.collections.stacks.example_01;

public class Stack {

    static final int MAX = 5;
    int top;
    int a[] = new int[MAX];     // Maximum size of stack

    Stack() {
        top = -1;
    }

    boolean isEmpty() {
        return (top<0);
    }

    boolean push(int x) {
        if(top>=(MAX-1)) {
            System.out.println("Stack Overflow");
            return false;
        }else{
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    int pop() {
        if(top<0) {
            System.out.println("Stack Underflow");
            return 0;
        }else{
            int x = a[top--];
            return x;
        }
    }

}