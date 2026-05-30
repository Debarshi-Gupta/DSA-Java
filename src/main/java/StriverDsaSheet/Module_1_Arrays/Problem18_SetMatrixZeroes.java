package StriverDsaSheet.Module_1_Arrays;

import java.util.Arrays;

// https://leetcode.com/problems/set-matrix-zeroes/description/

public class Problem18_SetMatrixZeroes {

    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void setZeroes(int[][] matrix) {
        boolean firstRowZero = false;
        boolean firstColumnZero = false;

        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                if (matrix[i][j]==0) {
                    if(i==0) {
                        firstRowZero = true;
                        matrix[0][j] = 0;
                    }
                    if (j==0) {
                        firstColumnZero = true;
                        matrix[i][0] = 0;
                    }
                    else {
                        matrix[0][j] = 0;
                        matrix[i][0] = 0;
                    }
                }
            }
        }

        for (int i=1; i<matrix.length; i++) {
            for (int j=1; j<matrix[i].length; j++) {
                if (matrix[0][j]==0 || matrix[i][0]==0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (firstRowZero) {
            for (int i=0; i<matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }

        if (firstColumnZero) {
            for (int i=0; i<matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
