package org.rv.dp1d;

/**
 * You are given an integer n representing the number of steps to reach the top of a staircase.
 * You can climb with either 1 or 2 steps at a time.
 *
 * Return the number of distinct ways to climb to the top of the staircase.
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        if ( n == 0 || n == 1) {
            return 1;
        }
        int current = 1, prev = 1;
        for(int i = 2; i <= n; i++) {
            int rem = current;
            current = current + prev;
            prev = rem;
        }
        return current;
    }
}
