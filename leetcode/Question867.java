package leetcode;

//  Transpose Matrix
import java.util.Arrays;

public class Question867 {
    private static int[][] transpose(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] transposeMat = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposeMat[j][i] = matrix[i][j];
            }
        }
        return transposeMat;
    }

    public static void main(String[] args) {
        // int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println(Arrays.deepToString(transpose(matrix)));
    }
}
