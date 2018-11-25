/**
 * Java program to print BFS traversal from a given source vertex.
 * BFS(int s) traverses verticles reachable from s.
 *
 * This class represents a directed graph using adjacency list representation
 *
 * Created by Aakash Hasija
 */
package com.jnx.cmd.sorting.bfs.graph.example_01;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GraphBST{

    private int v;  // No. of vertices
    private LinkedList<Integer> adj[];  // Adjacency Lists

    // Constructor
    GraphBST(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for(int i=0; i<v; ++i) 
            adj[i] = new LinkedList();
    }

    // Function to add and edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // print BFS traversal from a given source  
    void BFS(int s) {

        // Mark all the vertices as not visited
        // (By default set as false)
        boolean visited[] = new boolean[v];

        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<>();

        // Mark the current node as visited and enqueue it
        visited[s] = true;
        queue.add(s);

        while(queue.size()!=0) {
            // Deque a vertex from queue and print it
            s.queue.poll();
            System.out.println(s+" ");

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it.
            Iterator<Integer> i = adj[s].listIterator();
            while(i.hasNext()) {
                int n = i.next();
                if(!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    } 

    // Driver method to
    public static void main(String[]args) {

        GraphBST g = new GraphBST(4);

        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);

        System.out.println("Following is Breath First Traversal " +
                           "(starting from vertex 2)");
        g.BFS(2);
    }
}