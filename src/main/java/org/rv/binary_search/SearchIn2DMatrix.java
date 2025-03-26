package org.rv.binary_search;

/**
 * You are given an m x n 2-D integer array matrix and an integer target.
 *
 * Each row in matrix is sorted in non-decreasing order.
 * The first integer of every row is greater than the last integer of the previous row.
 * Return true if target exists within matrix or false otherwise.
 *
 * Can you write a solution that runs in O(log(m * n)) time?
 */
public class SearchIn2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length, col = matrix[0].length;
        int start = 0, mid, end = row * col - 1;
        while (start <= end) {
            if(matrix[start/row][start%row] == target)
                return true;
            if(matrix[end/row][end%row] == target)
                return true;
            mid = start + (end-start)/2;
            if(matrix[mid/row][mid%row] == target)
                return true;
            if (matrix[mid/row][mid%row] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return false;
    }
}
