package com.datastructures.stack;

import java.util.Stack;

public class StackOperations {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack); // [1, 2, 3]

        System.out.println(stack.pop()); // 3
        System.out.println(stack); // [1, 2]
    }
}
