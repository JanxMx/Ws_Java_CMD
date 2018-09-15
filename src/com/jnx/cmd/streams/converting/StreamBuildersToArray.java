/**
 * Convert Stream to array using stream.toArray(EntryType[]::new)
 */
package com.jnx.cmd.streams.converting;
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamBuildersToArray {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<10; i++) {
            list.add(i);
        }
        System.out.println(list.toString());

        Stream<Integer> stream = list.stream();
        Integer[] evenNumbersArr = 
                stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
        System.out.println(Arrays.toString(evenNumbersArr));
    }

}