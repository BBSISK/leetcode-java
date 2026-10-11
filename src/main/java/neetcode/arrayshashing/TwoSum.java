package neetcode.arrayshashing;


import java.util.HashMap;
import java.util.Map;
/**
 * LeetCode 1. Two Sum (Easy)
 * https://leetcode.com/problems/two-sum/
 *
 * Given an array of integers nums and an integer target, return the indices
 * of the two numbers that add up to target. Exactly one solution exists,
 * and the same element may not be used twice.
 *
* Approach:  One pass with a HashMap of value -> index. For each number,
 *            work out the complement (target - nums[i]). If the complement
 *            is already in the map, return both indices; otherwise store
 *            the current number and its index and move on.
 * Time:      O(n) - each element visited once, HashMap lookups are O(1)
 * Space:     O(n) - the map can hold up to n entries
 * What I learned: Learned about using a HASHmap which swaps space 
 *            for time - storing what I'v already seen removes the 
 * inner loop. Checking before putting
 *            stops an element being paired with itself. (Previous commit
 *            has the O(n²) brute force with O(1) space.)
 */ 

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }

    throw new IllegalArgumentException("No two numbers add up to target");

    }
}
