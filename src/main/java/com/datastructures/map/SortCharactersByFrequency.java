package com.datastructures.map;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/sort-characters-by-frequency/
 *
 * @author saransh
 */
public class SortCharactersByFrequency {
    public static void main(String[] args) {
        System.out.println(sortByFrequency("eera"));
    }

    public static String sortByFrequency(String s) {
        Map<Character, Integer> elCountMap = new TreeMap<>();
        for (Character n : s.toCharArray()) {
            if (elCountMap.containsKey(n)) {
                elCountMap.put(n, elCountMap.get(n) + 1);
            } else {
                elCountMap.put(n, 1);
            }
        }

        if (elCountMap.isEmpty()) {
            return null;
        }

        return elCountMap.entrySet().stream()
                .sorted(java.util.Comparator.comparing(Map.Entry<Character, Integer>::getValue, java.util.Comparator.reverseOrder())
                        .thenComparing(Map.Entry::getKey))
                .map(e -> e.getKey().toString().repeat(e.getValue()))
                .collect(Collectors.joining());
    }
}
