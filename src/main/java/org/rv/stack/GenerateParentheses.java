package org.rv.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * You are given an integer n.
 * Return all well-formed parentheses strings
 * that you can generate with n pairs of parentheses.
 *
 * Example 1:
 *
 * Input: n = 1
 *
 * Output: ["()"]
 */
public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();
        generateParenthesisHelper(0, 0, n, "", ans);
        return ans;
    }

    private void generateParenthesisHelper(int currentOpeningBracket, int currentClosingBracket, int maxBracket, String s, List<String> ans) {
        if (currentOpeningBracket > maxBracket)
            return;
        if (currentOpeningBracket == currentClosingBracket && currentOpeningBracket == maxBracket) {
            ans.add(s);
            return;
        }
        generateParenthesisHelper(currentOpeningBracket+1, currentClosingBracket, maxBracket, s + "(", ans);
        if (currentClosingBracket < currentOpeningBracket)
            generateParenthesisHelper(currentOpeningBracket, currentClosingBracket+1, maxBracket, s + ")", ans);
    }
}
