package com.jnx.cmd.sorting.comparator.example_01;

import java.util.Comparator;

public class NameComparator implements Comparator {

    @Override
    public int compare(Object obj1, Object obj2) {
        Player p1 = (Player) obj1;
        Player p2 = (Player) obj2;
        return p1.getName().compareTo(p2.getName()); 
    }

}