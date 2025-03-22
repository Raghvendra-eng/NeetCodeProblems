package org.rv;

import org.rv.array_hashmap_solution.*;
import org.rv.two_pointer_solution.TwoPointers;

import java.util.*;

import static org.rv.util.PrintUtil.printArray;
import static org.rv.util.PrintUtil.printListOfList;
import static org.rv.util.StringManipulationUtil.getIntegerArrayFromString;

public class Main {
    public static void main(String[] args) {
        ArrayAndHashMap arrayAndHashMap = new ArrayAndHashMap();
        TwoPointers twoPointers = new TwoPointers();
        System.out.println("Below list contains ProblemCodes and problem description. Choose the ProblemCode from the below list");
        System.out.println("\n==================== Arrays & Hashing Problems List: ====================\n");
        arrayAndHashMap.printListOfProblemCode();
        System.out.println("==================== Two Pointers Problem Code List: ====================\n");
        twoPointers.printListOfProblemCode();
        System.out.print("Enter problem code : ");

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String problemCode = sc.next();
        int len;
        if (problemCode.toUpperCase().startsWith("AHP-")) {
            arrayAndHashMap.setProblemCode(problemCode.toUpperCase());
            arrayAndHashMap.solve();
        } else  if (problemCode.toUpperCase().startsWith("TP-")) {
            twoPointers.setProblemCode(problemCode.toUpperCase());
            twoPointers.solve();
        }
    }
}