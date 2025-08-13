package com.datastructures.stack;

public class ReverseSignedInteger {
    public static void main(String[] args) {
        int[] nums = {123, -123, 0, 1534236469, -2147483412, 1563847412};
        for (int num : nums) {
            System.out.println(reverse(num));
        }
    }

    private static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            rev = rev * 10 + digit;
            num /= 10;
        }
        return rev;
    }
}
