package org.rv.two_pointer_solution;

import java.util.*;

/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] where nums[i] + nums[j] + nums[k] == 0, and the indices i, j and k are all distinct.
 *
 * The output should not contain any duplicate triplets. You may return the output and the triplets in any order.
 *
 * Example 1:
 *
 * Input: nums = [-1,0,1,2,-1,-4]
 *
 * Output: [[-1,-1,2],[-1,0,1]]
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for ( int i = 0; i < nums.length; i++) {
            for ( int j = i+1, k = nums.length - 1; j < k; ) {
                if ((nums[i]+nums[j]+nums[k]) == 0) {
                    set.add(List.of(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
                else if ((nums[i] + nums[j] + nums[k]) < 0)
                    j++;
                else k--;
            }
        }
        return List.copyOf(set);
    }
}
