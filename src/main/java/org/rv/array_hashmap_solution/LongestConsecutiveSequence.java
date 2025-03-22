package org.rv.array_hashmap_solution;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers nums, return the length of the longest consecutive sequence of elements that can be formed.
 *
 * A consecutive sequence is a sequence of elements in which each element is exactly 1 greater than the previous element.
 * The elements do not have to be consecutive in the original array.
 *
 * You must write an algorithm that runs in O(n) time.
 */
public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++)
            set.add(nums[i]);
        int ans = 0, i = 0;
        while (!set.isEmpty()) {
            if (set.contains(nums[i])) {
                int count = 1;
                int no = nums[i];
                for ( int j = no-1; set.contains(j); j--) {
                    count++;
                    set.remove(j);
                }
                for ( int j = no+1; set.contains(j); j++) {
                    count++;
                    set.remove(j);
                }
                set.remove(no);
                ans = Math.max(ans, count);
            }
            i++;
        }
        return ans;
    }
}
