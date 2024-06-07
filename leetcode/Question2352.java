package leetcode;

/**
 * Question2352 - Equal Row and Column Pairs
 */
public class Question2352 {
    private static int isPair(int[][] grid, int r, int c) {
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][r] != grid[c][i]) {
                return 0;
            }
        }
        return 1;
    }

    private static int equalPairs(int[][] grid) {
        int n = grid.length, count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[0][i] == grid[j][0]) {
                    count += isPair(grid, i, j);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // int[][] grid = { { 3, 2, 1 }, { 1, 7, 6 }, { 2, 7, 7 } };
        int[][] grid = { { 3, 1, 2, 2 }, { 1, 4, 4, 5 }, { 2, 4, 2, 2 }, { 2, 4, 2, 2 } };
        System.out.println(equalPairs(grid));
    }
}