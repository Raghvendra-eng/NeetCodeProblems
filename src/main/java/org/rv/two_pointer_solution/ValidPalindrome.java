package org.rv.two_pointer_solution;

/**
 * Given a string s, return true if it is a palindrome, otherwise return false.
 *
 * A palindrome is a string that reads the same forward and backward. It is also case-insensitive and ignores all non-alphanumeric characters.
 *
 * Example 1:
 *
 * Input: s = "Was it a car or a cat I saw?"
 *
 * Output: true
 * Explanation: After considering only alphanumerical characters we have "wasitacaroracatisaw", which is a palindrome.
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s= s.toLowerCase();
        String allowedCharacters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for ( int i = 0, j = s.length() - 1; i < j; ) {
            if(!allowedCharacters.contains(""+s.charAt(i))) {
                i++;
                continue;
            }
            if(!allowedCharacters.contains(""+s.charAt(j))) {
                j--;
                continue;
            }
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
