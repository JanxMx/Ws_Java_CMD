/**
 * List of members used for the exercises
 */
package com.jnx.cmd.streams.exercises;

import java.util.ArrayList;
import java.util.List;

public class Members {

    List<String> members;

    Members() {
        createMembers();
    }

    private void createMembers() {
        members = new ArrayList<>();
        members.add("Amitabh");
        members.add("Shekar");
        members.add("Aman");
        members.add("Rahul");
        members.add("Shahrukh");
        members.add("Salman");
        members.add("Yana");
        members.add("Lokesh");
    }

    public List<String> getMembers() {
        return members;
    }

}