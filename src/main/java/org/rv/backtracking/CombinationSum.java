package org.rv.backtracking;

import java.util.*;

/**
 * You are given an array of distinct integers nums
 * and a target integer target.
 * Your task is to return a list of all unique combinations of nums
 * where the chosen numbers sum to target.
 *
 * The same number may be chosen from nums an unlimited number of times.
 * Two combinations are the same if the frequency of each of the chosen numbers is the same,
 * otherwise they are different.
 *
 * You may return the combinations in any order
 * and the order of the numbers in each combination can be in any order.
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> map = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        combinationSumHelper(map, nums, list, target, 0);
        return map;
    }

    private void combinationSumHelper(List<List<Integer>> set, int[] nums, List<Integer> list, int target, int start) {
        if (target < 0)
            return;
        if (target == 0) {
            Collections.sort(list);
            set.add(list);
            return;
        }
        list.add(-1);
        for (int i = start; i < nums.length && nums[i] <= target; i++) {
            list.set(list.size()-1, nums[i]);
            combinationSumHelper(set, nums, new ArrayList<>(list), target - nums[i], i);
        }
    }
}
