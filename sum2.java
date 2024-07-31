package com.shivjava;
 import java.util.*;

public class sum2 {
    public static void main(String[] args) {
        // Example input: an array of integers and a target sum
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Create an instance of your Solution class
        Solution solution = new Solution();

        // Call the twoSum method
        int[] result = solution.twoSum(nums, target);

        // Print the result
        System.out.println("Indices of the two numbers that add up to the target:");
        System.out.println(Arrays.toString(result));
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int j = 0; j < nums.length; j++) {
            int num = nums[j];
            int complement = target - num;
            if (map.containsKey(complement)) {
                int index = map.get(complement);
                if (index == j) continue;
                return new int[]{j, index};
            }
        }

        return new int[]{};
    }
}
