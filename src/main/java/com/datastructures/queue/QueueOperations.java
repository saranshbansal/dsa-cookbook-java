package com.datastructures.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);

        System.out.println(q); // [10, 20, 30, 40]
        System.out.println(q.peek()); // 10
        System.out.println(q.poll()); // 10
        System.out.println(q.remove()); // 20
        System.out.println(q); // [30, 40]
    }
}
