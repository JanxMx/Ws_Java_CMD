package com.jnx.cmd.datastructures.trees.binarytrees.creation_03;

public class BinaryTree {
    
    Node root;

    public BinaryTree() {
        root = null;
    }

    void printPreOrder(Node node) {
        if(node == null)
            return;
        System.out.println(Integer.toString(node.key));
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    void printInOrder(Node node) {
        if(node==null)
            return;

        printInOrder(node.left);
        System.out.println(Integer.toString(node.key));
        printInOrder(node.right);    
    }

    void printPostOrder(Node node) {
        if(node == null)
            return;
        
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.println(Integer.toString(node.key));
    }

    void printPreOrder() { printPreOrder(root); }
    void printInOrder() { printInOrder(root); }
    void printPostOrder() { printPostOrder(root); }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new  Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);

        // preOrder
        System.out.println("------- PreOrder -------");
        tree.printPreOrder();

        // inOrder
        System.out.println("------- InOrder -------");
        tree.printInOrder();

        // postOrder
        System.out.println("------- PostOrder -------");
        tree.printPostOrder();
    }

}

class Node {

    int key;
    Node left, right;

    public Node(int item) {
        this.key = item;
        left = right = null;
    }

}