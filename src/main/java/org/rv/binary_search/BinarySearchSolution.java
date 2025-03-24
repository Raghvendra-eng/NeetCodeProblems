package org.rv.binary_search;

import org.rv.sliding_window.BestTimeToBuyAndSellStock;

import java.util.Scanner;

import static org.rv.util.StringManipulationUtil.getIntegerArrayFromString;

public class BinarySearchSolution {

    private String problemCode;
    private final Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public BinarySearchSolution() {}

    public void printListOfProblemCode() {
        System.out.println("BS-1 : Binary Search in Sorted Array");
        System.out.println();
    }

    public void setProblemCode(String problemCode) {
        this.problemCode = problemCode;
    }

    public void solve() {
        switch (problemCode) {
            case "BS-1":
                System.out.println("Binary Search");
                System.out.println("Please provide comma separated integer values of the sorted array (with space after comma)");
                System.out.println("eg. 1, 2, 3, 4");
                String inputArrayForBinarySearch = sc.next();
                BinarySearch binarySearch = new BinarySearch();
                System.out.println("Give target element to search in sorted array");
                int target = sc.nextInt();
                System.out.printf("Target element is present at index = %d\n" +
                        binarySearch.search(getIntegerArrayFromString(inputArrayForBinarySearch), target));
                break;
            default:
                System.out.println("Invalid problemCode for sliding window");
        }
    }
}
