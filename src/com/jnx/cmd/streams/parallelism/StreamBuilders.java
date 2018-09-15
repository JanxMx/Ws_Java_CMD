/**
 * With the Fork/Join framework added in Java SE 7, we have efficient machinery 
 * for implementing parallel operations in our applications.
 * But implementing this framework is itself a complex task; and if not doneright;
 * is a source of complex multi-threading bugs having potential to crash the application.
 * With the introduction of internal iteration, we got the possibility of operations
 * to be done in parallel.
 *
 * To enable parallelism, all you have to do is to create a parallel stream, 
 * instead of sequential stream. And to surprise you, this is really very easy. 
 * In any of above listed stream examples, anytime you want to particular job
 * using multiple threads in parallel cores, all you have to call method 
 * parallelStream() method instead of stream() method. 
 */
package com.jnx.cmd.streams.parallelism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamBuilders {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        for(int i=1; i<10; i++) {
            list.add(i);
        } 

        // Here creating a parallel stream
        Stream<Integer> stream = list.parallelStream();
        Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
        System.out.println(Arrays.toString(evenNumbersArr));
    }

}