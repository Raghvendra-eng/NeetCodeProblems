package org.rv.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    List<List<Integer>> ans;
    public List<List<Integer>> subsets(int[] nums) {
        ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        generateSubsets(nums, 0);
        return ans;
    }

    private void generateSubsets(int[] nums, int index) {
        if (index >= nums.length )
            return;
        List<List<Integer>> lists = new ArrayList<>();
        for ( int i = 0; i < ans.size(); i++) {
            List<Integer> list = new ArrayList<>(ans.get(i));
            list.add(nums[index]);
            lists.add(list);
        }
        ans.addAll(lists);
        generateSubsets(nums, index+1);
    }
}
