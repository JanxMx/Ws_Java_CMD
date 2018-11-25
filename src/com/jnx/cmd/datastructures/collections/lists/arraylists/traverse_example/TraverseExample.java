package com.jnx.cmd.datastructures.collections.lists.arraylists.traverse_example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TraverseExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        TraverseExample te = new TraverseExample();
        te.traverseList(list);
    }

    private static void traverseList(List data) {
        System.out.println("Using simplfied for loop/foreach");
        for(Object obj: data) {
            System.out.println(obj);
        }

        System.out.println("Using for loop");
        for(int i=0, n=data.size(); i<n; i++) {
            System.out.println(data.get(i));
        }

        System.out.println("Using Iterator/For");
        for(Iterator it=data.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }

        System.out.println("Using Iterator");
        Iterator itr = data.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }


    }

}