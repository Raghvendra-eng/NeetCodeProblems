package org.rv.solution;

import java.util.*;

/**
 * Given an integer array nums and an integer k,
 * return the k most frequent elements within the array.
 *
 * The test cases are generated such that the answer is always unique.
 *
 * You may return the output in any order.
 */

public class TopKMostFrequentElement {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o2).compareTo(map.get(o1));
            }
        });
        for ( int num : nums) {
            map.compute(num, (key, v) -> v == null ? 1 : v + 1);
        }
        for(Integer key: map.keySet()) {
            pq.add(key);
            if (pq.size() > k) {
                pq.remove();
            }
        }
        int []ans =  new int[pq.size()];
        int i = 0;
        for (Integer element: pq)
            ans[i++] = element;
        return ans;
    }
}
