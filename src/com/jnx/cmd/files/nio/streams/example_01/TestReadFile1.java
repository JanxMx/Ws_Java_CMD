// https://www.mykyong.com/java8/java-8-stream-read-a-file-line-by-line/

/**
 * Use Files.lines to read a file as a Stream.
 */
package com.jnx.cmd.files.nio.streams.example_01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TestReadFile1 {

    public static void main(String[] args) {
        String fileName = "c://temp/lines.txt";

        // read file into stream, try-with resources
        try(Stream<String> stream = Files.lines(Paths.get(fileName))) {

            stream.forEach(System.out::println);
        }catch(IOException e) {    
            e.printStackTrace();
        }
    }

}