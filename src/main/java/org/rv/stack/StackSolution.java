package org.rv.stack;

import org.rv.sliding_window.BestTimeToBuyAndSellStock;

import java.util.Scanner;

import static org.rv.util.StringManipulationUtil.getIntegerArrayFromString;

public class StackSolution {

    private String problemCode;
    private final Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public StackSolution() {}

    public void printListOfProblemCode() {
        System.out.println("S-1 : Valid Parentheses");
        System.out.println();
    }

    public void setProblemCode(String problemCode) {
        this.problemCode = problemCode;
    }

    public void solve() {
        switch (problemCode) {
            case "S-1":
                System.out.println("Valid Parentheses");
                System.out.println("Please provide comma separated integer values of the array (with space after comma)");
                System.out.println("eg. 1, 2, 3, 4");
                String inputArrayForBestTimeToBuyAndSellStock = sc.next();
                BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
                System.out.println("Max profit by buying and selling stock is: " +
                        bestTimeToBuyAndSellStock.maxProfit(getIntegerArrayFromString(inputArrayForBestTimeToBuyAndSellStock)));
                break;
            default:
                System.out.println("Invalid problemCode for Stack problem");
        }
    }
}
