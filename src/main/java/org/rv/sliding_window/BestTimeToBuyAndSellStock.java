package org.rv.sliding_window;

/**
 * You are given an integer array prices where prices[i] is the price of NeetCoin on the ith day.
 *
 * You may choose a single day to buy one NeetCoin and choose a different day in the future to sell it.
 *
 * Return the maximum profit you can achieve.
 * You may choose to not make any transactions, in which case the profit would be 0.
 *
 * Example 1:
 *
 * Input: prices = [10,1,5,6,7,1]
 *
 * Output: 6
 * Explanation: Buy prices[1] and sell prices[4], profit = 7 - 1 = 6.
 */
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int ans = 0;
        int len = prices.length;
        int rightMax = prices[len - 1];
        for ( int i = len -2; i >= 0; i--) {
            ans = Math.max(rightMax - prices[i], ans);
            rightMax = Math.max(rightMax, prices[i]);
        }
        return ans;
    }
}
