package com.datastructures.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * https://leetcode.com/problems/valid-parentheses/
 *
 * @author saransh
 */
public class BalanceParenthesis {
    public static void main(String[] args) {
        BalanceParenthesis obj = new BalanceParenthesis();
        System.out.println(obj.isValid("()"));
        System.out.println(obj.isValid("(}"));
        System.out.println(obj.isValid("([])"));
        System.out.println(obj.isValid("([)]"));
        System.out.println(obj.isValid("()[]{})"));
        System.out.println(obj.isValid(""));
        System.out.println(obj.isValid(null));
    }

    public boolean isValid(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> stack = new Stack<>();
        for (Character ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                stack.push(ch);
            } else if (stack.isEmpty() || !map.get(stack.pop()).equals(ch)) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
