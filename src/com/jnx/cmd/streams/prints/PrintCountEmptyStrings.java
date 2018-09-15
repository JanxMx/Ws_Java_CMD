package com.jnx.cmd.streams.prints;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PrintCountEmptyStrings {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        System.out.println("Strings: " + strings);

        // get count of empty string
        long count = strings.stream().filter(string -> string.isEmpty()).count();
        System.out.println("Count:   " + count);
    }
}