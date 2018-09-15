package com.jnx.cmd.streams.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamFindFirst {

    public static void main(String[] args) {

        Members members = new Members();
        List<String> memberList = members.getMembers();
        System.out.println("members: " + memberList);

        String firstMatchedName = memberList.stream()
                        .filter((s) -> s.startsWith("S"))
                        .findFirst().get();

        System.out.println("First start with S: " + firstMatchedName);

        String firstMatchedName2 = memberList.stream()
                        .filter((s) -> s.endsWith("n"))
                        .findFirst().get(); 
        System.out.println("First end with n: " + firstMatchedName2);

    }

}