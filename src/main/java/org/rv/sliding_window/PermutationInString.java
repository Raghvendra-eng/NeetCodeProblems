package org.rv.sliding_window;

import java.util.HashMap;
import java.util.Map;

/**
 * You are given two strings s1 and s2.
 *
 * Return true if s2 contains a permutation of s1, or false otherwise.
 * That means if a permutation of s1 exists as a substring of s2, then return true.
 *
 * Both strings only contain lowercase letters.
 *
 * Example 1:
 *
 * Input: s1 = "abc", s2 = "lecabee"
 *
 * Output: true
 */
public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            map.compute(s1.charAt(i), (k, v) -> v == null ? 1: v+1);
        }
        Map<Character, Integer> windowMap = new HashMap<>(map);
        int start = 0;
        for (int i = 0; i < s2.length();) {
            if (!map.containsKey(s2.charAt(i))) {
                windowMap = new HashMap<>(map);
                start = i + 1;
                i++;
            } else if (!windowMap.containsKey(s2.charAt(i))) {
                windowMap.compute(s2.charAt(start), (k, v) -> v == null ? 1 : v + 1);
                start = start + 1;
                i = Math.max(start, i);
            } else {
                windowMap.compute(s2.charAt(i), (k, v) -> v == 1 ? null : v-1);
                i++;
            }
            if (windowMap.isEmpty())
                return true;
        }
        return false;
    }

}
