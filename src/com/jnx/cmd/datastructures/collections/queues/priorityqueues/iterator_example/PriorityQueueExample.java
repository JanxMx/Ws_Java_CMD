/**
 * PriorityQueue order elements according to their natural ordering or 
 * by a comparator provided at construction time.
 */
package com.jnx.cmd.datastructures.collections.queues.priorityqueues.iterator_example;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        Queue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Michael Schumacher");
        priorityQueue.add("Michael Jordan");
        priorityQueue.add("Michael Jackson");
        
        System.out.println("head " + priorityQueue.element());
        System.out.println("head " + priorityQueue.peek());

        System.out.println("-- iterating the queue elements: ");
        Iterator itr = priorityQueue.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        priorityQueue.remove();
        priorityQueue.poll();

        System.out.println("-- After removing two elements: ");
        Iterator itr2 = priorityQueue.iterator(); 
        while(itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        System.out.println("Process completed successfully!! ");
    }
}