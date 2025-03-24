package org.rv.util;

import java.util.List;

public class PrintUtil {

    public static void printArray(int []nums) {
        for ( int num: nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static <T> void printListOfList(List<List<T>> lists) {
        for (List<T> list: lists) {
            for (T str: list) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }
}
