package org.rv.binary_search;

/**
 * You are given an integer array piles
 * where piles[i] is the number of bananas in the ith pile.
 * You are also given an integer h,
 * which represents the number of hours you have to eat all the bananas.
 *
 * You may decide your bananas-per-hour eating rate of k.
 * Each hour, you may choose a pile of bananas and eats k bananas from that pile.
 * If the pile has less than k bananas,
 * you may finish eating the pile but you can not eat from another pile in the same hour.
 *
 * Return the minimum integer k such that you can eat all the bananas within h hours.
 *
 * Example 1:
 *
 * Input: piles = [1,4,3,2], h = 9
 *
 * Output: 2
 */
public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1, end = 1, mid, ans = Integer.MAX_VALUE;
        for (int numBanana : piles)
            end = Math.max(end, numBanana);

        while (start <= end) {
            mid = start + (end-start)/2;
            if (countHours(piles, mid) <= h) {
                ans = Math.min(ans, mid);
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    private int countHours(int[] piles, int num) {
        int ans = 0;
        for (int banana : piles) {
            ans += (banana + num - 1)/num;
        }
        return ans;
    }
}
