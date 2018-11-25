package com.jnx.cmd.datastructures.collections.stacks.creation;

public class CreateStack {

    public static void main(String[] args) {

        //createStack();
        Stack stack1 = new Stack();
        System.out.println("length: " + stack1.size());

        int max = 5;
        Stack stack2 = new Stack(max);
        System.out.println("length: " + stack2.size());

        for(int i=0; i<max; i++)
            stack2.push(i);

        for(int i=0; i<max+1; i++)
            stack2.pop();
        
        System.out.println("Process completed successfully!!");
    }
}

class Stack {

    private int MAX;
    private int top;
    private int stack[];

    public Stack() {
        createArray(10);
    };

    public Stack(int max) {
        createArray(max);
    };

    private void createArray(int max) {
        this.MAX = (max==0) ? 10 : max;
        stack = new int[this.MAX];
        top = -1;
        System.out.println("MAX: " + MAX);
    }

    public boolean isEmpty() {
        return top==-1;
    }

    public boolean push(int element) {
        if(top<MAX-1) {
            stack[++top] = element;
            System.out.println("Value " + element + " inserted successfully!!");
            return true;
        }
        System.out.println("Stack Overflow, value was not inserted");
        return false;
    }

    public int pop() {
        if(top>-1) {
            int element = stack[top];
            stack[top--] = -1;
            System.out.println("Value " + element + " deleted successfully!!");
            return element;
        }
        System.out.println("Stack Underflow, there are no values for delete");
        return 0;
    }

    public int size() {
        return stack.length;
    }

}