package org.rv.stack;

import java.util.Stack;

/**
 * You are given an array of strings tokens that represents
 * a valid arithmetic expression in Reverse Polish Notation.
 *
 * Return the integer that represents the evaluation of the expression.
 *
 * The operands may be integers or the results of other operations.
 * The operators include '+', '-', '*', and '/'.
 * Assume that division between integers always truncates toward zero.
 * Example 1:
 *
 * Input: tokens = ["1","2","+","3","*","4","-"]
 *
 * Output: 5
 *
 * Explanation: ((1 + 2) * 3) - 4 = 5
 */
public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        String operators = "+-*/";
        Stack<Integer> s = new Stack<>();
        for ( int i = 0; i < tokens.length; i++) {
            if (operators.contains(tokens[i])) {
                int second = s.pop();
                int first = s.pop();
                s.push(calculate(first, second, tokens[i]));
            } else {
                s.push(Integer.parseInt(tokens[i]));
            }
        }
        return s.pop();
    }

    private int calculate(int first, int second, String operator) {
        return switch (operator) {
            case "+" -> first + second;
            case "-" -> first - second;
            case "*" -> first * second;
            case "/" -> first / second;
            default -> 0;
        };
    }
}
