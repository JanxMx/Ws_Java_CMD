/**
 * Java program to implement Tree Sort 
 * Created by Vibin M
 */
package com.jnx.cmd.sorting.treesort.example_01;

import java.util.Arrays;

public class GFG {

    // Class containing left and right child
    // of current node and key value
    class Node {
        int key;
        Node left, right;

        Node(int key) {
            this.key = key;
            left = right = null; 
        }
    }

    // Root of BST
    Node root;

    // Constructor
    public GFG() {
        root = null;
    }

    // This method mainly calls insertRec()
    void insert(int key) {
        root = insertRec(root, key);
    }

    /**
     * A recursive function to insert
     * a new key in BST
     */
    Node insertRec(Node root, int key) {
        // If the tree is empty, return a new code
        if(root==null) {
            root = new Node(key);
            return root;
        }

        // Otherwise, recur down the tree
        if(key<root.key)
            root.left = insertRec(root.left, key);
        else if(key>root.key)
            root.right = insertRec(root.right, key);
    
        // return the root
        return root;
    }

    // A function to do inorder traversal of BST
    void inorderRec(Node root) {
        if(root!=null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    void treeins(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            insert(arr[i]);
        }
    }

    // Drive Code
    public static void main(String[] args) {
        GFG tree = new GFG();
        int arr[] = {5, 4, 7, 2, 11};
        System.out.println("------- Original Array -------");
        System.out.println(Arrays.toString(arr));

        tree.treeins(arr);
        System.out.println("------- Sorted Array -------");
        tree.inorderRec(tree.root);
    }
}