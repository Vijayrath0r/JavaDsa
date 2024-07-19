package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Question1380 - Lucky Numbers in a Matrix
 */
public class Question1380 {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[] rows = new int[n], cols = new int[m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int val = matrix[i][j];
                if (cols[i] == 0 || cols[i] > val) {
                    cols[i] = val;
                }

                if (rows[j] == 0 || rows[j] < val) {
                    rows[j] = val;
                }
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (cols[i] == rows[j]) {
                    result.add(cols[i]);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Question1380 solution = new Question1380();
        int[][] matrix = { { 3, 7, 8 }, { 9, 11, 13 }, { 15, 16, 17 } };

        System.out.println(solution.luckyNumbers(matrix));
    }
}