package org.rv.two_pointer_solution;

import java.util.Scanner;

import static org.rv.util.PrintUtil.*;
import static org.rv.util.StringManipulationUtil.getIntegerArrayFromString;

public class TwoPointers {

    private final String problemCode;
    private final Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public TwoPointers(String problemCode) {
        this.problemCode = problemCode;
    }

    public void printListOfProblemCode() {
        System.out.println("TP-1 : Valid Palindrome");
        System.out.println("TP-2 : Two Sum Input Array is Sorted");
        System.out.println("TP-3 : Three Sum");
    }

    public void solve() {
        switch (problemCode.toUpperCase()) {
            case "TP-1":
                System.out.println("Give input string to check it is valid palindrome or not");
                ValidPalindrome validPalindromeObj = new ValidPalindrome();
                System.out.println(validPalindromeObj.isPalindrome(sc.next()));
                break;
            case "TP-2":
                System.out.println("Two Sum input array is sorted");
                System.out.println("Please provide comma separated integer values of the array (with space after comma)");
                System.out.println("eg. 1, 2, 3, 4");
                String inputArray = sc.next();
                int []nums = getIntegerArrayFromString(inputArray);
                TwoSumInputArraySorted twoSumInputArraySorted = new TwoSumInputArraySorted();
                System.out.println("Provide target sum");
                int target = sc.nextInt();
                printArray(twoSumInputArraySorted.twoSum(nums, target));
                break;
            case "TP-3":
                System.out.println("Three Sum");
                System.out.println("Please provide comma separated integer values of the array (with space after comma)");
                System.out.println("eg. 1, 2, 3, 4");
                String inputArrayForThreeSum = sc.next();
                ThreeSum threeSumObj = new ThreeSum();
                printListOfListIntegers(threeSumObj.threeSum(getIntegerArrayFromString(inputArrayForThreeSum)));
                break;
            default:
                System.out.println("Invalid problemCode");
        }
    }
}