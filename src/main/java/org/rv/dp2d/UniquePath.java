package org.rv.dp2d;

/**
 * There is an m x n grid where you are allowed to move either down or to the right at any point in time.
 *
 * Given the two integers m and n,
 * return the number of possible unique paths that can be taken from the
 * top-left corner of the grid (grid[0][0]) to the bottom-right corner (grid[m - 1][n - 1]).
 *
 * You may assume the output will fit in a 32-bit integer.
 */
public class UniquePath {
    public int uniquePaths(int m, int n) {
        if (m + n == 0)
            return 1;
        return calculateCombination(m+n-2, Math.min(m, n)-1);
    }

    private int calculateCombination(int n, int r) {
        int ans = 1;
        for ( int i = 1; i <= r; i++) {
            ans = ans * (n-i+1)/i;
        }
        return ans;
    }
}
