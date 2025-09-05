package com.ifeomare.Neetcode150;

import java.util.HashSet;
class ContainsDuplicate{
    // EASY: Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
    // Time Complexity - You should aim for a solution with O(n) time and O(n) space, where n is the size of the input array.
        // Input: nums = [1, 2, 3, 3]
        // Output: true

        // Input: nums = [1, 2, 3, 4]
        // Output: false

    // BRUTE FORCE - checking every element against every other element -> O(n^2)
    // method 1 - using a sorting alg like insertion sort to order the elements in ascending order
    // loop through the elements and check each element against it's neighbors, return true if found
    // method 2 - use Hash set to continuously add elements to the set; use .contains() to check for duplicates

    // based on the given examples, is the array in ascending order?
    // if the array was in ascending or decending order, we could use method 1 without creating a sorting algorithm
    // if not, we can use method 2 to complete this problem
    // either way, method 2 seems like the simpler option

        // using method 2 - given an input, nums - int[]
            // initialize a HashSet(numSet)
            // loop through nums
                // check if the current element is also an element in numSet
                    // if so, return true
                    // if not continue loop
            // return false when loop is finished

    public boolean isDuplicate(int[] nums) {
        HashSet<Integer> numSet = new HashSet<Integer>();
        for (int i: nums) {
            if (numSet.contains(i))
                return true;
            else
                numSet.add(i);
        }
        return false;
    }

    // TO RUN: uncomment below or move it to main
//    public static void main(String[] args) {
//        int[] arr1 = {1, 2, 3, 3};
//        int[] arr2 = {1, 2, 3, 4};
//
//        System.out.println(isDuplicate(arr1));
//        System.out.println(isDuplicate(arr2));
//    }
}