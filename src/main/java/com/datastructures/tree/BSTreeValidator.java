package com.datastructures.tree;

/**
 * Check if a given binary tree can represent a Binary Search Tree or not (min and max method)
 *
 * @author sbansal
 */
class BSTreeValidator {

    TreeNode root;

    public static void main(String[] args) {
        BSTreeValidator bst = new BSTreeValidator();

        TreeNode root = new TreeNode(40);
        root.left = new TreeNode(30);
        root.right = new TreeNode(80);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(35);
        root.right.left = new TreeNode(50);
        root.right.right = new TreeNode(100);
        System.out.println(bst.isValidBst(root));

        root.right.right = new TreeNode(70);
        System.out.println(bst.isValidBst(root));
    }

    boolean isValidBst(TreeNode root) {
        return isValidBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean isValidBst(TreeNode root, int min, int max) {
        if (root == null) {
            return true;
        }
        if (root.key < min || root.key > max) {
            return false;
        }
        return isValidBst(root.left, min, root.key - 1) && isValidBst(root.right, root.key + 1, max);
    }
}
