package com.datastructures.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueueOperations {
    public static void main(String[] args) {
        Deque<Integer> q = new ArrayDeque<>();
        q.offerFirst(10);
        q.offerFirst(40);
        q.offerLast(20);
        q.offerFirst(30);

        System.out.println(q); // [30, 40, 10, 20]
        System.out.println(q.peekFirst()); // 30
        System.out.println(q.pollLast()); // 20
        System.out.println(q.removeFirst()); // 30
        System.out.println(q); // [40, 10]
    }
}
