/**
 * Classic Scanner (JDK1.5)
 * Read a file line by line
 * It's working still, just developers are moving toward Stream
 */
package com.jnx.cmd.files.nio.streams.example_01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TestReadFile5 {

    public static void main(String[] args) {

        String fileName = "c://temp/lines.txt";

        try (Scanner scanner = new Scanner(new File(fileName))) {

            while(scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    } 

}