package org.rv.sliding_window;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string s, find the length of the longest substring without duplicate characters.
 *
 * A substring is a contiguous sequence of characters within a string.
 *
 * Example 1:
 *
 * Input: s = "zxyzxyz"
 *
 * Output: 3
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        int start  = 0;
        for ( int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                ans = Math.max(ans, map.size());
                int key = map.get(s.charAt(i));
                while (start <= key) {
                    map.remove(s.charAt(start));
                    start++;
                }
            }
            map.put(s.charAt(i), i);
        }
        return Math.max(ans, map.size());
    }
}
