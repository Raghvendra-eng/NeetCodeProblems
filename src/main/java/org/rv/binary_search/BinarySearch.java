package org.rv.binary_search;

/**
 * You are given an array of distinct integers nums, sorted in ascending order, and an integer target.
 *
 * Implement a function to search for target within nums.
 * If it exists, then return its index, otherwise, return -1.
 *
 * Your solution must run O(logn) time.
 *
 * Example 1:
 *
 * Input: nums = [-1,0,2,4,6,8], target = 4
 *
 * Output: 3
 */
public class BinarySearch {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1, mid;
        while (start <= end) {
            if (nums[start] == target)
                return start;
            if (nums[end] == target)
                return end;
            mid = start + (end-start)/2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}
