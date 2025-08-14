package com.datastructures.string;

import java.util.*;

/**
 * https://leetcode.com/problems/largest-3-same-digit-number-in-string
 *
 * A “good integer” is any substring of length 3 where all three digits are the same (e.g., "777").
 * Return the maximum good integer as a string or an empty string "" if no such integer exists.
 */
public class LargestGoodInteger {
    public static void main(String[] args) {
        LargestGoodInteger lgi = new LargestGoodInteger();
        System.out.println(lgi.largestGoodInteger("677713333999"));
    }

    public String largestGoodInteger(String num) {
        for (char c = '9'; c >= '0'; c--) {
            String target = "" + c + c + c;
            if (num.contains(target)) {
                return target;
            }
        }
        return "";
    }
}
