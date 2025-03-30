package org.rv.greedy_algorithms;

/**
 * Given an array of integers nums, find the subarray with the largest sum and return the sum.
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 * Example 1:
 *
 * Input: nums = [2,-3,4,-2,2,1,-1,4]
 *
 * Output: 8
 * Explanation: The subarray [4,-2,2,1,-1,4] has the largest sum 8.
 */
public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0)
            return 0;
        int maxSoFar = nums[0], ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxSoFar = Math.max(maxSoFar + nums[i], nums[i]);
            ans = Math.max(ans, maxSoFar);
        }

        return ans;
    }
}
