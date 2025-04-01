package org.rv.sliding_window;

import java.util.*;

/**
 * You are given a string s consisting of only uppercase english characters and an integer k.
 * You can choose up to k characters of the string and replace them with any other uppercase English character.
 *
 * After performing at most k replacements,
 * return the length of the longest substring which contains only one distinct character.
 *
 * Example 1:
 *
 * Input: s = "XYYX", k = 2
 *
 * Output: 4
 * Explanation: Either replace the 'X's with 'Y's, or replace the 'Y's with 'X's.
 */

public class LongestRepeatingCharacterReplacement {

    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        PriorityQueue<Character> mostFrequent = new PriorityQueue<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return map.get(o2).compareTo(map.get(o1));
            }
        });
        int start = 0, ans = 0;
        for ( int i = 0; i < s.length(); i++) {
            map.compute(s.charAt(i), (key, v) -> v == null ? 1 : v +1);
            mostFrequent.remove(s.charAt(i));
            mostFrequent.add(s.charAt(i));
            if ((i - start + 1 - map.get(mostFrequent.peek())) <= k) {
                ans = Math.max(ans, i - start + 1);
            } else {
                while(i - start + 1 - map.get(mostFrequent.peek()) > k && start <= i) {
                    map.compute(s.charAt(start), (key, v) -> v == 1 ? null: v -1);
                    mostFrequent.remove(s.charAt(start));
                    if (map.containsKey(s.charAt(start)))
                        mostFrequent.add(s.charAt(start));
                    start++;
                }
            }
        }
        return ans;
    }
}
