
/**
 * TreeSet - are unique order items. 
 *
 *           the
 *           /
 *        quick
 *         /
 *      brown
 *         \
 *         fox
 *         / \
 *      dog   jump
 *              \
 *              over
 *              /
 *            lazy
 */
package com.jnx.cmd.datastructures.collections.sets.treesets.example_01;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        String phrase = "the quick brown fox jumps over the lazy dog";
        String[] phraseList = phrase.split(" ");

        TreeSet<String> words = new TreeSet<>();
        words.addAll(Arrays.asList(phraseList));

        for(String w: words) {
            System.out.println(w);
        }
    }
}
