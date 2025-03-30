package org.rv.advanced_graph;

import java.util.*;

public class NetworkDelayTime {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, GraphNode> graph = new HashMap<>();
        for (int []row: times) {
            if (graph.containsKey(row[0])) {
                GraphNode g = graph.get(row[0]);
                g.edgesWithWeight.put(row[1], row[2]);
            } else {
                graph.put(row[0], new GraphNode(row));
            }
        }
        Map<Integer, Integer> minTime = new HashMap<>();
        PriorityQueue<List<Integer>> pq = new PriorityQueue<>(new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(1).compareTo(o2.get(1));
            }
        });
        Set<Integer> visited = new HashSet<>();
        minTime.put(k, 0);
        pq.add(Arrays.asList(k, 0));
        while (!pq.isEmpty()) {
            List<Integer> top = pq.peek();
            pq.poll();
            visited.add(top.get(0));
            GraphNode ptrNode = graph.get(top.get(0));
            if (ptrNode != null) {
                for (Integer key : ptrNode.edgesWithWeight.keySet()) {
                    if (!visited.contains(key)) {
                        if (minTime.containsKey(key))
                            pq.remove(Arrays.asList(key, minTime.get(key)));
                        int timeFromCurrentNode = minTime.get(top.get(0)) + ptrNode.edgesWithWeight.get(key);
                        minTime.compute(key, (ke, v) -> v == null ? timeFromCurrentNode : Math.min(v, timeFromCurrentNode));
                        pq.add(Arrays.asList(key, minTime.get(key)));
                    }
                }
            }
        }
        if (minTime.size() != n)
            return -1;
        int minValue = 0;
        for (int i : minTime.values()) {
            minValue = Math.max(i, minValue);
        }
        return minValue;
    }

    private class GraphNode {
        Map<Integer, Integer> edgesWithWeight = new HashMap<>();
        GraphNode(int []row) {
            Map<Integer, Integer> m = new HashMap<>();
            m.put(row[1], row[2]);
            edgesWithWeight = m;
        }
    }
}
