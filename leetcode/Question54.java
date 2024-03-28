package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Question54 {

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int count = 0, r = 0, c = 0, i = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        while (count < m * n) {
            if (c == i && r == i + 1 && n != 1) {
                i++;
            }
            result.add(matrix[r][c]);
            if (c < n - (i + 1) && r == i) {
                c++;
            } else if (c == n - (i + 1) && r < m - (i + 1)) {
                r++;
            } else if (c > i && r == m - (i + 1)) {
                c--;
            } else if (c == i && r > i) {
                r--;
            } else {
                r++;
            }
            count++;
        }
        return result;
    }

    public static void main(String[] args) {
        // int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        // int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
        // int[][] matrix = { { 1, 1, 1, 1, 2 }, { 4, 5, 5, 6, 2 }, { 4, 8, 9, 6, 2 }, {
        // 4, 8, 7, 7, 2 }, { 4, 3, 3, 3, 3 } };
        // int[][] matrix = { { 7 }, { 9 }, { 6 } };
        int[][] matrix = {
                { 2, 3, 4 },
                { 5, 6, 7 },
                { 8, 9, 10 },
                { 11, 12, 13 },
                { 14, 15, 16 } };
        System.out.println(spiralOrder(matrix));
    }
}
