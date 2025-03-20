package org.rv;

import org.rv.solution.ContainsDuplicate;
import org.rv.solution.ValidAnagram;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Below list contains ProblemCodes and problem description. Choose the ProblemCode from the below list");
        System.out.println("\nNeetCode Arrays & Hashing Problems List:\n");
        System.out.println("AHP-1: Contains Duplicate");
        System.out.println("AHP-2: Valid Anagram");
        System.out.print("\nEnter problem code : ");

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String problemCode = sc.next();

        switch (problemCode.toUpperCase()) {
            case "AHP-1":
                System.out.println("Contains Duplicate");
                System.out.println("Please provide comma separated integer values of the array (with space after comma)");
                System.out.println("eg. 1, 2, 3, 4");
                String inputArray = sc.next();
                String[] stringNumber = inputArray.split(", ");
                int []nums = new int[stringNumber.length];
                for (int iterator = 0; iterator < stringNumber.length; iterator++) {
                    nums[iterator] = Integer.parseInt(stringNumber[iterator]);
                }
                ContainsDuplicate obj = new ContainsDuplicate();
                System.out.println(obj.hasDuplicate(nums));
                break;
            case "AHP-2":
                System.out.println("Valid Anagram");
                System.out.print("Please provide first string : ");
                String first = sc.next();
                System.out.print("\nPlease provide first string : ");
                System.out.println();
                String second = sc.next();
                ValidAnagram validAnagram = new ValidAnagram();
                System.out.println(validAnagram.isAnagram(first, second));
                break;
        }
    }
}