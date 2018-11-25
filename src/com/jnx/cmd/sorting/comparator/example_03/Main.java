package com.jnx.cmd.sorting.comparator.example_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int rollno;
    String name, address;

    Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return this.rollno + " " + this.name + " " + this.address;
    }
}

class SortByRoll implements Comparator<Student> {
    
    // used for compare ints
    public int compare(Student a, Student b) {
        return a.rollno - b.rollno;
    }
}

class SortByName implements Comparator<Student> {
    
    //used for compare Strings
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);   
    } 
}

// Driver class
public class Main {

    public static void main(String[] args) {

        List<Student> ar = new ArrayList<>();
        ar.add(new Student(111, "bbbb", "london"));
        ar.add(new Student(131, "aaaa", "nyc"));
        ar.add(new Student(121, "cccc", "jaipur"));

        System.out.println("Unsorted");
        for(int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new SortByRoll());
        System.out.println("\nSorted by rollno");
        for(int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new SortByName());
        System.out.println("\nSorted by name");
        for(int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));    
   }
}

