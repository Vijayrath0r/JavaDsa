// 48. Rotate Image
package leetcode;

public class Question48 {
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        int temp = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > i-1; j--) {
                // System.out.println(
                //         " ( " + i + ", " + j + ") ->" +
                //                 " ( " + j + ", " + (n - i + 1) + ") ->" +
                //                 " ( " + (n - i + 1) + ", " + (n - j + 1) + ") ->" +
                //                 " ( " + (n - j + 1) + ", " + i + ") ->" +
                //                 " ( " + i + ", " + j + ")");
                temp = matrix[i - 1][j - 1];
                matrix[i - 1][j - 1] = matrix[n - j][i - 1];
                matrix[n - j][i - 1] = matrix[n - i][n - j];
                matrix[n - i][n - j] = matrix[j - 1][n - i];
                matrix[j - 1][n - i] = temp;
            }
            // System.out.println("*************************");
        }
        printMatrix(matrix);
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 5, 1, 9, 11 },
                { 2, 4, 8, 10 },
                { 13, 3, 6, 7 },
                { 15, 14, 12, 16 }
        };
        /*
         * [15,13,2,5],
         * [14,3,4,1],
         * [12,6,8,9],
         * [16,7,10,11]]
         */
        // int[][] matrix = {
        //     {1,2,3},
        //   {4,5,6},
        //   {7,8,9}
        // };
        rotate(matrix);
    }
}
