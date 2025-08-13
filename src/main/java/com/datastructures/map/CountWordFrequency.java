package com.datastructures.map;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/word-frequency/
 *
 * @author saransh
 */
public class CountWordFrequency {
    public static void main(String[] args) {
        System.out.println(wordCounts("quick brown fox jumps over the lazy dog"));
    }

    public static Map<String, Integer> wordCounts(String str) {
        String[] words = str.split(" ");
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        return wordCountMap;
    }
}
