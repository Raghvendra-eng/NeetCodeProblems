package org.rv.array_hashmap_solution;


/*
Given an array of strings strs, group all anagrams together into sublists.
You may return the output in any order.

An anagram is a string that contains the exact same characters as another string,
but the order of the characters can be different.

Example 1:

Input: strs = ["act","pots","tops","cat","stop","hat"]

Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.*;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for ( String str: strs) {
            char[] key = str.toCharArray();
            Arrays.sort(key);
            String finalKey = new String(key);
            map.compute(finalKey, (k, v) -> {
                v = v==null ? new ArrayList<>() : v;
                v.add(str);
                return v;
            });
        }
        Collection<List<String>> ans = map.values();
        return List.copyOf(ans);
    }
}
