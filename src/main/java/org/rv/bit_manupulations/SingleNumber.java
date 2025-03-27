package org.rv.bit_manupulations;

/**
 * You are given a non-empty array of integers nums. Every integer appears twice except for one.
 *
 * Return the integer that appears only once.
 *
 * You must implement a solution with
 * O
 * (
 * n
 * )
 * O(n) runtime complexity and use only
 *
 * O(1) extra space.
 *
 * Example 1:
 *
 * Input: nums = [3,2,3]
 *
 * Output: 2
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int ans  = 0;
        for ( int i = 0; i < nums.length; i++)
            ans = ans ^ nums[i];
        return ans;
    }
}
