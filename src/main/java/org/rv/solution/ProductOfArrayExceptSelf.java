package org.rv.solution;

/**
 * Given an integer array nums, return an array output where output[i] is the product of all the elements of nums except nums[i].
 *
 * Each product is guaranteed to fit in a 32-bit integer.
 *
 * Follow-up: Could you solve it in
 * O
 * (
 * n
 * )
 * O(n) time without using the division operation?
 *
 * Example 1:
 *
 * Input: nums = [1,2,4,6]
 *
 * Output: [48,24,12,8]
 * Example 2:
 *
 * Input: nums = [-1,0,1,2,3]
 *
 * Output: [0,-6,0,0,0]
 */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int [] ans  = new int[nums.length];
        ans[0] = 1;
        for ( int i = 1; i < nums.length; i++)
            ans[i] = ans[i-1] * nums[i-1];
        int productRight = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            productRight *= nums[i+1];
            ans[i] = ans[i]*productRight;
        }
        return ans;
    }
}
