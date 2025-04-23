package org.rv.backtracking;

import java.util.*;

public class CombinationSum2 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSum2Helper(candidates, set, list, target, 0, 0);
        return set.stream().toList();
    }

    private void combinationSum2Helper(int[] candidates, Set<List<Integer>> set, List<Integer> list, int target, int currentSum, int index) {
        if (currentSum == target) {
            set.add(new ArrayList<>(list));
            return;
        }
        if (index >= candidates.length || currentSum > target) {
            return;
        }
        for ( int i = index; i < candidates.length; i++) {
            if ((i == index || (candidates[i] != candidates[i-1])) && (currentSum+candidates[i] <= target)) {
                list.add(candidates[i]);
                combinationSum2Helper(candidates, set, list, target, currentSum+candidates[i], i + 1);
                list.removeLast();
            }
        }
    }

}
