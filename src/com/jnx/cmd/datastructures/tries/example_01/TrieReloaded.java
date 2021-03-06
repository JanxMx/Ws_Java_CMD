/**
 * Java implementation of search and insert operations on Trie
 * Code created by Sumit Gosh
 */
package com.jnx.cmd.datastructures.tries.example_01;

public class TrieReloaded {

    // Alphabet size (# of symbols)
    static final int ALPHABET_SIZE = 26;

    // trie node
    static class TrieNode {
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];

        // isEndOfWord is true if the node represents end of a word
        boolean isEndOfWord;

        TrieNode() {
            isEndOfWord = false;
        
            for(int i=0; i<ALPHABET_SIZE; i++)
                children[i] = null;
        }
    }

    static TrieNode root;

    /**
     * If not present, inserts key into trie
     * If the key is prefix of trie node,
     * Just marks leaf node
     */
    static void insert(String key) {
        int level;                  // level of node
        int length = key.length();  // string length
        int index;                  // char value, ie: a=0, b=1, c=2...

        TrieNode pCrawl = root;

        for(level=0; level<length; level++) {
            index = key.charAt(level) - 'a';    // 99(c) - 97(a) = 2   (children[2])  
            if(pCrawl.children[index] == null)
                pCrawl.children[index] = new TrieNode();    // add node

            pCrawl = pCrawl.children[index];    // move to children node
        }

        // mark last node as leaf
        pCrawl.isEndOfWord = true;
    }

    // Returns true if key presents in trie, else false
    static boolean search(String key) {
        int level;
        int length = key.length();
        int index;

        TrieNode pCrawl = root;

        for(level=0; level<length; level++) {
            index = key.charAt(level) - 'a';
            if(pCrawl.children[index] == null)
                return false;

            pCrawl = pCrawl.children[index];
        }

        return (pCrawl != null && pCrawl.isEndOfWord);
    }

    // Driver
    public static void main(String[] args) {
        // Input keys (use only 'a' through 'z' and lower case)
        String keys[] = {"the", "a", "there", "answer", "any", "by", "bye", "their"};
 
        //String output[] = {"Not present in trie", "Present in trie"};

        root = new TrieNode();

        // Construct trie
        for(int i=0; i<keys.length; i++)
            insert(keys[i]);
        
        // search for different keys
        searchWord("the");
        searchWord("these");
        searchWord("their");
        searchWord("thaw");
    }

    static void searchWord(String word) {
        String output[] = {"Not present in trie", "Present in trie"};

        if(search(word)==true)
            System.out.println(word + " --> " + output[1]);
        else
            System.out.println(word + " --> " + output[0]);
    }

}