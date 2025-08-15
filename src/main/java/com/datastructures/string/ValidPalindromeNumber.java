package com.datastructures.string;

public class ValidPalindromeNumber {
    public static void main(String[] args) {
        ValidPalindromeNumber obj = new ValidPalindromeNumber();
        System.out.println(obj.isPalindrome(121));
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String s = String.valueOf(x);
        int left = 1;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
