package neetcode.arrayshashing;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode 217. Contains Duplicate (Easy)
 * https://leetcode.com/problems/contains-duplicate/
 *
 * Given an integer array nums, return true if any value appears at least
 * twice in the array, and false if every element is distinct.
 *
 * Approach:  Using a HashSet to store the numbers we've seen so far. If we see a number
 *            that is already in the set, we return true. If we finish iterating
 *            through the array without finding any duplicates, we return false.
 * Time:      O(n)
 * Space:     O(n)
 * What I learned: Us eof the Hash 
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        
       Set<Integer> seen = new HashSet<>();

        for(int num : nums) {
            if(seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        

        return false;


    }
}
