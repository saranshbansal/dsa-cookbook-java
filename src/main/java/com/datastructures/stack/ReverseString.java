package com.datastructures.stack;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        char[] arr = {'h', 'e', 'l', 'l', 'o'};

        Stack<Character> stack = new Stack<>();
        for (Character c : arr) {
            stack.push(c);
        }

        int i = 0;
        while (!stack.isEmpty()) {
            arr[i] = stack.pop();
            i++;
        }

        System.out.println(arr);
    }
}
