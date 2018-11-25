/**
 * Classic BufferedReader (JDK1.1)
 * Read a file line by line
 * It's working still, just developers are moving toward Stream
 */
package com.jnx.cmd.files.nio.streams.example_01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestReadFile4 {

    public static void main(String[] args) {

        String fileName = "c://temp/lines.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    } 

}