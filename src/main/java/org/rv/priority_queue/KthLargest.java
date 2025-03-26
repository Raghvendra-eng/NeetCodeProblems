package org.rv.priority_queue;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Design a class to find the kth largest integer in a stream of values, including duplicates.
 * E.g. the 2nd largest from [1, 2, 3, 3] is 3. The stream is not necessarily sorted.
 *
 * Implement the following methods:
 *
 * constructor(int k, int[] nums)
 * Initializes the object given an integer k and the stream of integers nums.
 * int add(int val)
 * Adds the integer val to the stream and returns the kth largest integer in the stream.
 */
class KthLargest {
    PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    });
    int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for ( int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
            if (pq.size() > k) {
                pq.poll();
            }
        }
    }

    public int add(int val) {
        pq.add(val);
        if (pq.size() > k) {
            pq.poll();
        }
        return pq.peek();
    }
}
