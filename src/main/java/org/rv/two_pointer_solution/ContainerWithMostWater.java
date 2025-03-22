package org.rv.two_pointer_solution;

public class ContainerWithMostWater {

    /**
     * You are given an integer array heights where heights[i] represents the height of the i-th bar.
     * You may choose any two bars to form a container.
     * Return the maximum amount of water a container can store.
     *
     * @param heights
     * @return
     */
    public int maxArea(int[] heights) {
        int ans = 0;
        for ( int i = 0, j = heights.length - 1; i < j; ) {
            ans = Math.max(ans, (j - i) * Math.min(heights[i], heights[j]));
            if (heights[i] <= heights[j])
                i++;
            else
                j--;
        }
        return ans;
    }
}
