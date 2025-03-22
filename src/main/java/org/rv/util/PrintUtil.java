package org.rv.util;

import java.util.List;

public class PrintUtil {

    public static void printArray(int []nums) {
        for ( int num: nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printListOfList(List<List<String>> lists) {
        for (List<String> list: lists) {
            for (String str: list) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }

    public static void printListOfListIntegers(List<List<Integer>> lists) {
        for (List<Integer> list: lists) {
            for (Integer str: list) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }
}
