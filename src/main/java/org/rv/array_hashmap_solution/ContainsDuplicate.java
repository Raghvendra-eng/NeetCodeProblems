package org.rv.array_hashmap_solution;

import java.util.HashSet;
import java.util.Set;

/*
Problem Statement:

Given an integer array nums,
return true if any value appears more than once in the array,
otherwise return false.

 */
public class ContainsDuplicate {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> elements = new HashSet<>();

        for (int number: nums) {
            if (elements.contains(number))
                return true;
            elements.add(number);
        }
        return false;
    }
}
