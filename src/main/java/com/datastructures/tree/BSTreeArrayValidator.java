package com.datastructures.tree;

import java.util.Stack;

/**
 * https://www.geeksforgeeks.org/check-if-a-given-array-can-represent-preorder-traversal-of-binary-search-tree/
 * <p>
 * Check if a given array can represent Preorder traversal of Binary Search Tree or not
 */
class BSTreeArrayValidator {

    public static void main(String[] args) {
        BSTreeArrayValidator bst = new BSTreeArrayValidator();

        int[] arr1 = new int[]{40, 30, 35, 80, 100};
        System.out.println(bst.isValidBst(arr1, arr1.length));

        int[] arr2 = new int[]{40, 30, 35, 20, 80, 100};
        System.out.println(bst.isValidBst(arr2, arr2.length));
    }

    boolean isValidBst(int[] arr, int n) {
        // Create an empty stack
        Stack<Integer> stack = new Stack<>();

        // Initialize current root as minimum possible
        // value
        int root = Integer.MIN_VALUE;

        // Traverse given array
        for (int i = 0; i < n; i++) {
            // If we find a node who is on right side
            // and smaller than root, return false
            if (arr[i] < root) {
                return false;
            }

            // If arr[i] is in right subtree of stack top,
            // Keep removing items smaller than arr[i]
            // and make the last removed item as new
            // root.
            while (!stack.empty() && stack.peek() < arr[i]) {
                root = stack.peek();
                stack.pop();
            }

            // At this point either stack is empty or
            // arr[i] is smaller than root, push arr[i]
            stack.push(arr[i]);
        }
        return true;
    }
}
