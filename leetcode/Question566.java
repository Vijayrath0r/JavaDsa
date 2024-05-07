package leetcode;
//Reshape the Matrix
import java.util.Arrays;

public class Question566 {
    private static int[][] matrixReshape(int[][] mat, int r, int c) {
        int originalRows = mat.length;
        int originalCols = mat[0].length;

        if (originalRows * originalCols != r * c) {
            return mat;
        }

        int[][] result = new int[r][c];
        int row = 0, col = 0;

        for (int i = 0; i < originalRows; i++) {
            for (int j = 0; j < originalCols; j++) {
                result[row][col] = mat[i][j];
                col++;
                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 2 }, { 3, 4 } };
        int r = 1, c = 4;
        // int[][] mat = { { 1, 2 }, { 3, 4 } };
        // int r = 2, c = 4;
        System.out.println(Arrays.deepToString(matrixReshape(mat, r, c)));
    }
}
