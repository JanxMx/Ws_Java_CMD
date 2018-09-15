package com.jnx.cmd.streams.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamMatch {
    
    public static void main(String[] args) {

        Members members = new Members();
        List<String> memberList = members.getMembers();
        System.out.println("members: " + memberList + "\n");

        boolean matchedResult = memberList.stream()
                    .anyMatch((s) -> s.startsWith("A"));
        System.out.println(matchedResult);

        matchedResult = memberList.stream()
                    .allMatch((s) -> s.startsWith("A"));
        System.out.println(matchedResult);

        matchedResult = memberList.stream()
                    .noneMatch((s) -> s.startsWith("A"));
        System.out.println(matchedResult);

    }

}