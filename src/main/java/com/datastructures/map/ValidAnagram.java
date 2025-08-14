package com.datastructures.map;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/valid-anagram/
 *
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * Solution:
 * 1. Simplest is just sort the strings and check if they are equal
 * 2. Use hashmaps
 *
 * @author saransh
 */
public class ValidAnagram {
    public static void main(String[] args) {
        ValidAnagram va = new ValidAnagram();
        System.out.println(va.isAnagram("anagram", "nagarma"));
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> countMapS = new HashMap<>();
        Map<Character, Integer> countMapT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char c1 = t.charAt(i);
            if (countMapS.containsKey(c)) {
                countMapS.put(c, countMapS.get(c) + 1);
            } else {
                countMapS.put(c, 1);
            }

            if (countMapT.containsKey(c1)) {
                countMapT.put(c1, countMapT.get(c1) + 1);
            } else {
                countMapT.put(c1, 1);
            }
        }

        return countMapT.equals(countMapS);
    }
}
