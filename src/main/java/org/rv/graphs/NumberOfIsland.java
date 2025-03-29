package org.rv.graphs;

import java.util.*;

/**
 *
 Given a 2D grid where '1' represents land and '0' represents water,
 count and return the number of islands.

 An island is formed by connecting adjacent lands horizontally or vertically and is surrounded by water.
 You may assume water is surrounding the grid (i.e., all the edges are water).
 */

public class NumberOfIsland {
    public int numIslands(char[][] grid) {
        Set<List<Integer>> visited = new HashSet<>();
        int ans = 0;
        for ( int i = 0; i < grid.length; i++) {
            for ( int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1' && !visited.contains(Arrays.asList(i, j))) {
                    List<Integer> pair = Arrays.asList(i, j);
                    ans++;
                    Queue<List<Integer>> q = new LinkedList<>();
                    q.add(pair);
                    while (!q.isEmpty()) {
                        List<Integer> p = q.poll();
                        int x = p.get(0), y = p.get(1);
                        if (isValid(x-1, y, grid.length, grid[0].length) && grid[x-1][y] == '1' && !visited.contains(Arrays.asList(x-1, y)))
                            q.add(Arrays.asList(x-1, y));
                        if (isValid(x, y-1, grid.length, grid[0].length) && grid[x][y-1] == '1' && !visited.contains(Arrays.asList(x, y-1)))
                            q.add(Arrays.asList(x, y-1));
                        if (isValid(x, y+1, grid.length, grid[0].length) && grid[x][y+1] == '1' && !visited.contains(Arrays.asList(x, y+1)))
                            q.add(Arrays.asList(x, y+1));
                        if (isValid(x+1, y, grid.length, grid[0].length) && grid[x+1][y] == '1' && !visited.contains(Arrays.asList(x+1, y)))
                            q.add(Arrays.asList(x+1, y));
                        visited.add(p);
                        }
                    }
            }
        }
        return ans;
    }

    private boolean isValid(int i, int j, int m, int n) {
        return i >= 0 && j >= 0 && i < m && j < n;
    }
}
