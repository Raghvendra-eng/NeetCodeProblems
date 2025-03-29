package org.rv.bit_manupulations;

/**
 * You are given a signed 32-bit integer x.
 *
 * Return x after reversing each of its digits.
 * After reversing, if x goes outside the signed 32-bit integer range [-2^31, 2^31 - 1],
 * then return 0 instead.
 *
 * Solve the problem without using integers that are outside the signed 32-bit integer range.
 *
 * Example 1:
 *
 * Input: x = 1234
 *
 * Output: 4321
 */
public class ReverseInteger {
    public int reverse(int x) {
        int ans = 0;
        boolean isPositive = (x >= 0);
        x = Math.abs(x);
        while( x > 0) {
            if (x/10 == 0) {
                if (ans > Integer.MAX_VALUE/10)
                    return 0;
                else if(ans == Integer.MAX_VALUE/10 ) {
                    if (isPositive && x > (Integer.MAX_VALUE%10))
                        return 0;
                    else if (!isPositive && x > 8)
                        return 0;
                    else if (!isPositive)
                        return (-1*ans - x);
                }
            }
            ans = ans*10 + (x%10);
            x = x/10;
        }
        return ans;
    }
}
