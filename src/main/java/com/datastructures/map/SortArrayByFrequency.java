package com.datastructures.map;

import java.util.*;

/**
 * https://leetcode.com/problems/sort-array-by-increasing-frequency/
 *
 * @author saransh
 */
public class SortArrayByFrequency {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortByFrequency(new int[]{1, 1, 2, 2, 2, 3})));
    }

    public static int[] sortByFrequency(int[] nums) {
        Map<Integer, Integer> elCountMap = new TreeMap<>();
        for (int n : nums) {
            if (elCountMap.containsKey(n)) {
                elCountMap.put(n, elCountMap.get(n) + 1);
            } else {
                elCountMap.put(n, 1);
            }
        }

        if (elCountMap.isEmpty()) {
            return new int[0];
        }

        List<Integer> numsList = new ArrayList<>();

        elCountMap.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry<Integer, Integer>::getValue)
                        .thenComparing(Map.Entry::getKey, Comparator.reverseOrder()))
                .forEach(e -> {
                    for (int i = 0; i < e.getValue(); i++) {
                        numsList.add(e.getKey());
                    }
                });
        for (int i = 0; i < nums.length; i++) {
            nums[i] = numsList.get(i);
        }
        return nums;
    }
}
