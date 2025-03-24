package org.rv.sliding_window;

import java.util.Scanner;
import static org.rv.util.StringManipulationUtil.getIntegerArrayFromString;

public class SlidingWindow {
    private String problemCode;
    private final Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public SlidingWindow() {}

    public void printListOfProblemCode() {
        System.out.println("SW-1 : Best Time to Buy and Sell Stock");
        System.out.println("SW-2 : Longest Substring Without Repeating Characters");
        System.out.println();
    }

    public void setProblemCode(String problemCode) {
        this.problemCode = problemCode;
    }

    public void solve() {
        switch (problemCode) {
            case "SW-1":
                System.out.println("Best Time to Buy and Sell Stock");
                System.out.println("Please provide comma separated integer values of the array (with space after comma)");
                System.out.println("eg. 1, 2, 3, 4");
                String inputArrayForBestTimeToBuyAndSellStock = sc.next();
                BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
                System.out.println("Max profit by buying and selling stock is: " +
                        bestTimeToBuyAndSellStock.maxProfit(getIntegerArrayFromString(inputArrayForBestTimeToBuyAndSellStock)));
                break;
            case "SW-2":
                System.out.println("Longest Substring Without Repeating Characters");
            default:
                System.out.println("Invalid problemCode for sliding window");
        }
    }
}
