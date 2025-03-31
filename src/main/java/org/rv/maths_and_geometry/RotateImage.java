package org.rv.maths_and_geometry;

/**
 * Given a square n x n matrix of integers matrix, rotate it by 90 degrees clockwise.
 *
 * You must rotate the matrix in-place. Do not allocate another 2D matrix and do the rotation.
 */
public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // Swap firstRow with the last row, 2nd row with 2nd last and so on....
        for( int i = 0, j = n-1; j > i; j--, i++) {
            for (int k = 0; k < n; k++) {
                int temp = matrix[i][k];
                matrix[i][k] = matrix[j][k];
                matrix[j][k] = temp;
            }
        }

        // taking transpose of matrix

        for ( int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
