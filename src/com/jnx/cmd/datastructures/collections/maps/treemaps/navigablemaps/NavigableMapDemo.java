package com.jnx.cmd.datastructures.collections.maps.treemaps.navigablemaps;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {

    public static void main(String[] args) {
        
        NavigableMap<String,Integer> nm = new TreeMap<>();
        nm.put("C",999);
        nm.put("Y",888);
        nm.put("A",777);
        nm.put("T",666);
        nm.put("B",555);
        nm.put("A",444);

        System.out.printf("Descending Set : %s%n", nm.descendingKeySet());
        System.out.printf("Floor Entry (First value inserted) : %s%n", nm.floorEntry("L"));
        System.out.printf("First Entry (Last value inserted) : %s%n", nm.firstEntry());
        System.out.printf("Last Key (Last Key of ordered elements) : %s%n", nm.lastKey());
        System.out.printf("First Key (First Key of ordered elements) : %s%n", nm.firstKey());
        System.out.printf("Original Map : %s%n", nm);
        System.out.printf("Descending Set : %s%n", nm.descendingMap());

    }
}