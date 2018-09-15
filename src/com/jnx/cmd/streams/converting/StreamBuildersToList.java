/**
 * Convert Stream to List using stream.collect(Collectors.toList())
 */
package com.jnx.cmd.streams.converting;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBuildersToList {

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<Integer>();
        for(int i=1; i<10; i++) {
            list.add(i);
        }
        System.out.println(list.toString());

        Stream<Integer> stream = list.stream(); 
        List<Integer> evenNumbersList = 
                stream.filter(i -> i%2 == 0).collect(Collectors.toList());
        
        System.out.println(evenNumbersList);
    }

}
