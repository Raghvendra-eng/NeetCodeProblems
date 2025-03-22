package org.rv.two_pointer_solution;

/**
 * You are given an array non-negative integers height which represent an elevation map.
 * Each value height[i] represents the height of a bar, which has a width of 1.
 *
 * Return the maximum area of water that can be trapped between the bars.
 *
 * Input: height = [0,2,0,3,1,0,1,3,2,1]
 *
 * Output: 9
 */
public class TrappingRainWater {

    public int trap(int[] height) {
        int ans = 0;
        int leftMax = height[0];
        int rightMax = height[height.length - 1];
        for ( int i = 1, j = height.length - 2; i <= j; ) {
            if (leftMax <= rightMax) {
                ans  += Math.max((Math.min(leftMax, rightMax) - height[i]), 0);
                leftMax = Math.max(leftMax, height[i]);
                i++;
            } else {
                ans  += Math.max((Math.min(leftMax, rightMax) - height[j]), 0);
                rightMax = Math.max(rightMax, height[j]);
                j--;
            }
        }
        return ans;
    }
}
