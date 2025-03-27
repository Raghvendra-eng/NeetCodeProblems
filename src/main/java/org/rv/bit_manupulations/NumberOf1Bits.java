package org.rv.bit_manupulations;

/**
 * You are given an unsigned integer n. Return the number of 1 bits in its binary representation.
 *
 * You may assume n is a non-negative integer which fits within 32-bits.
 *
 * Example 1:
 *
 * Input: n = 00000000000000000000000000010111
 *
 * Output: 4
 */
public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int ans = 0;
        while (n > 0) {
            n = n & (n-1);
            ans ++;
        }
        return ans;
    }
}
