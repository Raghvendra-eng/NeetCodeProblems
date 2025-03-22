package org.rv.array_hashmap_solution;

import java.util.HashMap;
import java.util.Map;

/*
Given two strings s and t,
return true if the two strings are anagrams of each other,
otherwise return false.

An anagram is a string that contains the exact same characters as another string,
but the order of the characters can be different.
 */

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.compute(s.charAt(i), (k, v) -> v == null ? 1: v + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            if (!map.containsKey(t.charAt(i))) {
                return false;
            }
            map.compute(t.charAt(i), (k, v) -> v == 1 ? null : v - 1);
        }
        return map.isEmpty();
    }
}
