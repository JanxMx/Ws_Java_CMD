package com.jnx.cmd.datastructures.trees.binarytrees.creation_02;

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
        tree.root = new  Node(25);
        tree.root.left = new Node(15);
        tree.root.right = new Node(50);
        tree.root.left.left = new Node(10);
        tree.root.left.right = new Node(22);
        tree.root.left.left.left = new Node(4);
        tree.root.left.left.right = new Node(12);
        tree.root.left.right.left = new Node(18);
        tree.root.left.right.right = new Node(24);
        tree.root.right.left = new Node(35);
        tree.root.right.right = new Node(70);
        tree.root.right.left.left = new Node(31);
        tree.root.right.left.right = new Node(44);
        tree.root.right.right.left = new Node(66);
        tree.root.right.right.right = new Node(90);

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