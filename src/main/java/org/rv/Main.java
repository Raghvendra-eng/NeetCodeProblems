package org.rv;

import org.rv.array_hashmap_solution.*;
import org.rv.binary_search.BinarySearchSolution;
import org.rv.linked_list.LinkedListSolutions;
import org.rv.sliding_window.SlidingWindow;
import org.rv.two_pointer_solution.TwoPointers;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayAndHashMap arrayAndHashMap = new ArrayAndHashMap();
        TwoPointers twoPointers = new TwoPointers();
        SlidingWindow slidingWindow = new SlidingWindow();
        BinarySearchSolution binarySearchSolution = new BinarySearchSolution();
        LinkedListSolutions linkedListSolutions = new LinkedListSolutions();
        System.out.println("Below list contains ProblemCodes and problem description. Choose the ProblemCode from the below list");
        System.out.println("\n==================== Arrays & Hashing Problems List: ====================\n");
        arrayAndHashMap.printListOfProblemCode();
        System.out.println("==================== Two Pointers Problem Code List: ====================\n");
        twoPointers.printListOfProblemCode();
        System.out.println("==================== Sliding Window Problem Code List: ====================\n");
        slidingWindow.printListOfProblemCode();
        System.out.println("==================== Binary Search Problem Code List: ====================\n");
        binarySearchSolution.printListOfProblemCode();
        System.out.println("==================== Linked list solutions: ====================\n");
        linkedListSolutions.printListOfProblemCode();

        System.out.print("Enter problem code : ");

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String problemCode = sc.next();

        if (problemCode.toUpperCase().startsWith("AHP-")) {
            arrayAndHashMap.setProblemCode(problemCode.toUpperCase());
            arrayAndHashMap.solve();
        } else  if (problemCode.toUpperCase().startsWith("TP-")) {
            twoPointers.setProblemCode(problemCode.toUpperCase());
            twoPointers.solve();
        } else if (problemCode.toUpperCase().startsWith("SW-")) {
            slidingWindow.setProblemCode(problemCode.toUpperCase());
            slidingWindow.solve();
        } else if (problemCode.toUpperCase().startsWith("LL-")) {
            linkedListSolutions.setProblemCode(problemCode.toUpperCase());
            linkedListSolutions.solve();
        }
    }
}