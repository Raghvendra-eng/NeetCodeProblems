package org.rv.solution;

import java.util.HashSet;
import java.util.Set;

/**
 * You are given a 9 x 9 Sudoku board. A Sudoku board is valid if the following rules are followed:
 *
 * Each row must contain the digits 1-9 without duplicates.
 * Each column must contain the digits 1-9 without duplicates.
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without duplicates.
 * Return true if the Sudoku board is valid, otherwise return false
 *
 * Note: A board does not need to be full or be solvable to be valid.
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        boolean ans = true;
        for ( int i = 0; ans && i < board.length; i++)
            ans = ans && validateRow(board, i);
        for ( int i = 0; ans && i < board[0].length; i++)
            ans = ans && validateColumn(board, i);
        for ( int i = 0; ans && i < board.length; i++)
            ans = ans && validateBox(board, i);
        return ans;
    }

    private boolean validateBox(char[][] board, int boxNumber) {
        Set<Character> set = new HashSet<>();
        for ( int i = 3*(boxNumber/3), j = 0; j < 3; i++, j++) {
            for (int m = i*3, n = 0; n < 3; m++, n++) {
                if (board[i][j] == '.')
                    continue;
                if (set.contains(board[i][j]))
                    return false;
                set.add(board[i][j]);
            }
        }
        return true;
    }

    private boolean validateColumn(char[][] board, int column) {
        Set<Character> set = new HashSet<>();
        for ( int i = 0; i < board.length; i++) {
            if (board[i][column] == '.')
                continue;
            if (set.contains(board[i][column]))
                return false;
            set.add(board[i][column]);
        }
        return true;
    }

    private boolean validateRow(char[][] board, int row) {
        Set<Character> set = new HashSet<>();
        for ( int i = 0; i < board[row].length; i++) {
            if (board[row][i] == '.')
                continue;
            if (set.contains(board[row][i]))
                return false;
            set.add(board[row][i]);
        }
        return true;
    }
}
