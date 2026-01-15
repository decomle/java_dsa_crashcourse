package com.decomle.dsa.crashcourse;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        // LIFO Stack way of using linkedlink
//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("C");
//        linkedList.push("D");
//        linkedList.push("F");
//        linkedList.pop();


        // FIFO Queue way of using linkedlist
//        linkedList.offer("A");
//        linkedList.offer("B");
//        linkedList.offer("C");
//        linkedList.offer("D");
//        linkedList.offer("F");
//        linkedList.add(4, "E");

//        linkedList.poll();

        long startTime = System.nanoTime();
        long endTime = System.nanoTime();

        System.out.println("Time: /t" + (endTime - startTime) + "ns");

    }
}
