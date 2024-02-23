//74. Search a 2D Matrix
package leetcode;

public class Question74 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {   //O(log(m * n))
            if (matrix[i][0] <= target && target <= matrix[i][matrix[i].length - 1]) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // int[][] matrix = {
        //         { 1, 3, 5, 7 },
        //         { 10, 11, 16, 20 },
        //         { 23, 30, 34, 60 } };
        // int target = 3;

        int[][] matrix = { { 1,3 }};
        int target = 3;
        System.out.println(searchMatrix(matrix, target));
    }

}