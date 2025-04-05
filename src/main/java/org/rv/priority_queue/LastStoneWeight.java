package org.rv.priority_queue;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * You are given an array of integers stones where stones[i] represents the weight of the ith stone.
 *
 * We want to run a simulation on the stones as follows:
 *
 * At each step we choose the two heaviest stones, with weight x and y and smash them togethers
 * If x == y, both stones are destroyed
 * If x < y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
 * Continue the simulation until there is no more than one stone remaining.
 *
 * Return the weight of the last remaining stone or return 0 if none remain.
 */

public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for ( int stoneWeight: stones) {
            pq.add(stoneWeight);
        }

        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            if ((first - second) != 0) {
                pq.add(first-second);
            }
        }
        if (pq.isEmpty())
            return 0;
        return pq.poll();
    }
}
