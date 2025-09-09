package com.ifeomare.Neetcode150;

import java.util.ArrayList;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t){
        // convert the string to an ArrayList
        // loop through the string s and on each iteration...
        // if the letter is found, remove it from newT - the arraylist
        // if not found, return false - not an anagram
        // return true

        // adding contents from String t to ArrayList myList
        if (s.length() == t.length()){
            ArrayList<String> myList = new ArrayList<String>();
            for (int i = 0; i < t.length(); i++)
                myList.add(t.substring(i, i+1));

            for (int i = 0; i < s.length(); i++) {
                String letter = s.substring(i, i+1);
                if (myList.contains(letter))
                    myList.remove(letter);
                else
                    return false;
            }
            return true;
        } else
            return false;

    }

    // TO RUN: uncomment the following or paste in main
//    public static void main(String[] args) {
//        // Valid Anagram
//        // Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
//        // An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
//        // Time: You should aim for a solution with O(n + m) time and O(1) space, where n is the length of the string s and m is the length of the string t.
//
//        // Example 1:
//        // Input: s = "racecar", t = "carrace"
//        // Output: true
//
//        // Example 2:
//        // Input: s = "jar", t = "jam"
//        // Output: false
//
//        // Constraints: s and t consist of lowercase English letters.
//
//        System.out.println(isAnagram("racecar", "carrace"));
//        System.out.println(isAnagram("jar", "jam"));
//    }
}
