package neetcode.arrayshashing;

/**
 * LeetCode 1. Two Sum (Easy)
 * https://leetcode.com/problems/two-sum/
 *
 * Given an array of integers nums and an integer target, return the indices
 * of the two numbers that add up to target. Exactly one solution exists,
 * and the same element may not be used twice.
 *
 * Approach:   Loop throuigh each number pair to find the 
 * target solution - stop when solution is found and return the 
 * indices of the two numbers
 * Time:       O(n^2)
 * Space:      O(1)
 * What I learned: Starting the inner loop at i + 1 skips pairs I've already checked 
 * and stops an element being paired with itself.
 */ 

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {


        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

    throw new IllegalArgumentException("No two numbers add up to target");

    }
}
