package org.rv.priority_queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> {
            return Integer.compare((o2[0]*o2[0] + o2[1]*o2[1]), (o1[0]*o1[0] + o1[1]*o1[1]));
        });
        for (int[] point: points) {
            pq.add(point);
            if (pq.size() > k) {
                pq.remove();
            }
        }
        int[][] ans = new int[k][2];
        int i = 0;
        while (!pq.isEmpty()) {
            ans[i] = pq.remove();
            i++;
        }
        return ans;
    }
}
