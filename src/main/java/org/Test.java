package org;

public class Test {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4,5},
                          {1,2,3,4,5}};
    }

    public boolean getNumberFromMatrix(int[][] matrix, int k) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int i = 0;
        int j = matrix[0].length - 1;
        int m = matrix.length;

        while (i < m & j >= 0) {
            if (k == matrix[i][j]) {
                return true;
            }
            if (k < matrix[i][j]) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}