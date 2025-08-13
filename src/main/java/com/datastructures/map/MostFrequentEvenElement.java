package com.datastructures.map;

import java.util.Map;
import java.util.TreeMap;

/**
 * https://leetcode.com/problems/most-frequent-even-element/
 *
 * @author saransh
 */
public class MostFrequentEvenElement {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 2, 4, 4, 1};
        System.out.println(mostFrequentEvenElement(nums));
    }

    public static int mostFrequentEvenElement(int[] nums) {
        Map<Integer, Integer> elCountMap = new TreeMap<>();
        for (int n : nums) {
            if (n % 2 != 0) {
                continue;
            }
            if (elCountMap.containsKey(n)) {
                elCountMap.put(n, elCountMap.get(n) + 1);
            } else {
                elCountMap.put(n, 1);
            }
        }

        if (elCountMap.isEmpty()) {
            return -1;
        }

        return elCountMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get().getKey();
    }
}
