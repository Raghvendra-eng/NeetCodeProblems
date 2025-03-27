package org.rv.bit_manupulations;

/**
 * Given a 32-bit unsigned integer n,
 * reverse the bits of the binary representation of n and return the result.
 *
 * Example 1:
 *
 * Input: n = 00000000000000000000000000010101
 *
 * Output:    2818572288 (10101000000000000000000000000000)
 */
public class ReverseBits {
    public int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans = (ans<<1) | (n&1);
            n = n>>1;
        }
        return ans;
    }
}
