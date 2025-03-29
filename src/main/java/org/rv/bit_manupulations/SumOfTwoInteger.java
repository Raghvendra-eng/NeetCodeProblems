package org.rv.bit_manupulations;

/**
 * Given two integers a and b,
 * return the sum of the two integers without using the + and - operators.
 */
public class SumOfTwoInteger {
    public int getSum(int a, int b) {
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        return getSum(a^b, ((a&b) << 1));
    }
}
