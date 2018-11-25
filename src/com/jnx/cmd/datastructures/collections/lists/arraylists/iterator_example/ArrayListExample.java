package com.jnx.cmd.datastructures.collections.lists.arraylists.iterator_example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Luz");
        list.add("Raquel");
        list.add("Tylor");
        list.add("Mary");
        list.add("Alicia");

        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("process completed succesfully!!");
    }

}