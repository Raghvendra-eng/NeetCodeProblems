package org.rv.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * You are given an array of non-overlapping intervals where intervals[i] = [start_i, end_i]
 * represents the start and the end time of the ith interval.
 * intervals is initially sorted in ascending order by start_i.
 *
 * You are given another interval newInterval = [start, end].
 *
 * Insert newInterval into intervals such that
 * intervals is still sorted in ascending order by start_i
 * and also intervals still does not have any overlapping intervals.
 * You may merge the overlapping intervals if needed.
 *
 * Return intervals after adding newInterval.
 *
 * Note: Intervals are non-overlapping if they have no common point.
 * For example, [1,2] and [3,4] are non-overlapping, but [1,2] and [2,3] are overlapping.
 */
public class InsertIntervals {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int index = binarySearch(intervals, newInterval);
        return appendAndMergeInterval(intervals, newInterval, index);
    }

    private int binarySearch(int[][] intervals, int[] newInterval) {
        int ans = -1;
        int start = 0, end = intervals.length - 1, mid;
        while (start <= end) {
            mid = start + (end - start)/2;
            if (intervals[mid][0] <= newInterval[0]) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
        return ans+1;
    }

    private int[][] appendAndMergeInterval(int[][] intervals, int[] newInterval, int index) {
        int start = 0;
        List<List<Integer>> ans = new ArrayList<>();
        while (start < index) {
            ans.add(Arrays.asList(intervals[start][0], intervals[start][1]));
            start++;
        }
        if (start == 0 || ans.get(start-1).get(1) < newInterval[0])
            ans.add(Arrays.asList(newInterval[0], newInterval[1]));
        else
            ans.get(start-1).set(1, Math.max(newInterval[1], ans.get(start-1).get(1)));
        while (start < intervals.length) {
            if (ans.get(ans.size() - 1).get(1) >= intervals[start][0])
                ans.get(ans.size() - 1).set(1, Math.max(ans.get(ans.size() - 1).get(1), intervals[start][1]));
            else
                ans.add(Arrays.asList(intervals[start][0], intervals[start][1]));
            start++;
        }
        return ans.stream().map(x -> x.stream().mapToInt(Integer::intValue).toArray()).toArray(int[][]::new);
    }
}
