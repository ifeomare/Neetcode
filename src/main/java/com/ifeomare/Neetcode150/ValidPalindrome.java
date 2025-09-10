package com.ifeomare.Neetcode150;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        // replace anything that is not a character or number with empty quotes
        // reverse the String s
        // comparing both strings using IgnoreCase

        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reversedS = "";
        for (int i = 0; i < s.length(); i++)
            reversedS = s.charAt(i) + reversedS;
        return s.equalsIgnoreCase(reversedS);
    }

    // TO RUN: uncomment the following or paste inside main
    //    public static void main(String[] args) {
    //
    //        // Valid Palindrome: Given a string s, return true if it is a palindrome, otherwise return false.
    //              // A palindrome is a string that reads the same forward and backward. It is also case-insensitive and ignores all non-alphanumeric characters.
    //                  // Note: Alphanumeric characters consist of letters (A-Z, a-z) and numbers (0-9).
    //              // You should aim for a solution with O(n) time and O(1) space, where n is the length of the input string.
    //        // Example 1:
    //              // Input: s = "Was it a car or a cat I saw?"
    //              // Output: true
    //        System.out.println(isPalindrome("Was it a car or a cat I saw?"));
    //        // Explanation: After considering only alphanumerical characters we have "wasitacaroracatisaw", which is a palindrome.
    //
    //        // Example 2:
    //              // Input: s = "tab a cat"
    //              // Output: false
    //        System.out.println(isPalindrome("tab a cat"));
    //        // Explanation: "tabacat" is not a palindrome.
    //
    //        // Constraints:
    //        // 1 <= s.length <= 1000
    //        // s is made up of only printable ASCII characters.
    //    }
}
