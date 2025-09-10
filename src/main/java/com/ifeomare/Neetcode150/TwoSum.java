package com.ifeomare.Neetcode150;

//import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // can i assume that the contents of the array are already in ascending order?

        // declare a hashmap
        // variable (difference = target - nums[i])
        // for loop and on each iteration...
        // check if difference exists in the hashmap
        // if so, we return i and the key found; break if need be
        // if not, we add i to the haspmap and continue
        // return hashmap

        int[] targetInd = new int[2];
        HashMap<Integer, Integer> numsCopy = new HashMap<>();
        int i = 0; // traversing nums array
        int diff = target - nums[i]; // the value we're looking for -> nums[i] + diff = target
        while (!numsCopy.containsValue(diff)){ // while we have not found the value
            numsCopy.put(i, nums[i]); // add nums[i] to the HashMap
            i += 1; // increment i by 1
            diff = target - nums[i]; // adjust the value of diff to match the current value of i
        }
        targetInd[1] = i;
        for (int j = 0; j < numsCopy.size(); j++) {
            if (numsCopy.get(j) == diff)
                targetInd[0] = j;
        }
        return targetInd;
    }

    // TO RUN: uncomment the following or paste the contents in main
//    public static void main(String[] args) {
//        // Two Sum:
//        // Given an array of integers (nums) and an integer (target), return the indices i and j such that nums[i] + nums[j] == target and i != j.
//        // You may assume that every input has exactly one pair of indices i and j that satisfy the condition.
//        // Return the answer with the smaller index first.
//        // You should aim for a solution with O(n) time and O(n) space, where n is the size of the input array.
//
//        // Example 1:
//        // Input: nums = [3,4,5,6], target = 7
//        // Output: [0,1]
//        // Explanation: nums[0] + nums[1] == 7, so we return [0, 1].
//        int[] nums1 = {3, 4, 5, 6};
//        System.out.println(Arrays.toString(twoSum(nums1, 7)));
//
//        // Example 2:
//        // Input: nums = [4,5,6], target = 10
//        // Output: [0,2]
//        int[] nums2 = {4, 5, 6};
//        System.out.println(Arrays.toString(twoSum(nums2, 10)));
//
//        // Example 3:
//        //Input: nums = [5,5], target = 10
//        // Output: [0,1]
//        int[] nums3 = {5, 5};
//        System.out.println(Arrays.toString(twoSum(nums3, 10)));
//
//        // Example 4:
//        // nums=[-1,-2,-3,-4,-5], target=-8
//        // Output: [2, 4]
//        int[] nums4 = {-1, -2, -3, -4, -5};
//        System.out.println(Arrays.toString(twoSum(nums4, -8)));
//
//        // Constraints:
//        // 2 <= nums.length <= 1000
//        // -10,000,000 <= nums[i] <= 10,000,000
//        // -10,000,000 <= target <= 10,000,000
//    }
}
