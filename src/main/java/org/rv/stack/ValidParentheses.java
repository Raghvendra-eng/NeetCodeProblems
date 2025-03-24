package org.rv.stack;

import java.util.Stack;

/**
 * You are given a string s consisting of the following characters: '(', ')', '{', '}', '[' and ']'.
 *
 * The input string s is valid if and only if:
 *
 * Every open bracket is closed by the same type of close bracket.
 * Open brackets are closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * Return true if s is a valid string, and false otherwise.
 *
 * Example 1:
 *
 * Input: s = "[]"
 *
 * Output: true
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        String openingBrackets = "({[";
        Stack<Character> stack = new Stack<>();
        for ( int  i = 0; i < s.length(); i++) {
            if(openingBrackets.contains(""+s.charAt(i))) {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty())
                    return false;
                if (!isValidPair(stack.peek(), s.charAt(i)))
                    return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    private boolean isValidPair(Character peek, char c) {
        return (peek == '{' && c == '}') ||
                (peek == '[' && c == ']') || (peek == '(' && c == ')');
    }
}
