package org.rv.bit_manupulations;

/**
 * Given an integer n, count the number of 1's in the
 * binary representation of every number in the range [0, n].
 *
 * Return an array output where output[i] is the number of 1's in the binary representation of i.
 */
public class CountingBits {
    public int[] countBits(int n) {
        int []ans = new int[n+1];
        ans[0] = 0;
        if (n>=1)
            ans [1] = 1;
        int nextPowerOfTwo = 2;
        for ( int i = 2; i <= n; i++) {
            if (i == nextPowerOfTwo) {
                ans[i] = 1;
                nextPowerOfTwo = 2*nextPowerOfTwo;
                continue;
            }
            ans[i] = ans[nextPowerOfTwo/2] + ans[i - nextPowerOfTwo/2];
        }
        return ans;
    }
}
