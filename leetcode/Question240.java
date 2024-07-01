package leetcode;

// Search a 2D Matrix II
public class Question240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int row = 0, col = n - 1;
        while (row < m && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Question240 soluton = new Question240();
        // int[][] matrix = {
        // { 1, 4, 7, 11, 15 },
        // { 2, 5, 8, 12, 19 },
        // { 3, 6, 9, 16, 22 },
        // { 10, 13, 14, 17, 24 },
        // { 18, 21, 23, 26, 30 }
        // };
        // int target = 5;
        // int target = 20;

        // int[][] matrix = { { -5 } };
        // int target = -10;

        // int[][] matrix = { {1,1} };
        // int target = 1;

        int[][] matrix = {
                { 1, 3, 5, 7, 9 },
                { 2, 4, 6, 8, 10 },
                { 11, 13, 15, 17, 19 },
                { 12, 14, 16, 18, 20 },
                { 21, 22, 23, 24, 25 } };
        int target = 11;

        System.out.println(soluton.searchMatrix(matrix, target));
    }
}
