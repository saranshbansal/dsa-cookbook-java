package com.datastructures.map;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/longest-consecutive-sequence/
 *
 * @author saransh
 */
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        LongestConsecutiveSequence l = new LongestConsecutiveSequence();
        System.out.println(l.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int max = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int current = num;
                int count = 1;
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}
