package leetcode;

// Find the Minimum Area to Cover All Ones I
public class Question3195 {
    public int minimumArea(int[][] grid) {
        int len = grid.length;
        int minRow = len, maxRow = -1;
        int minCol = len, maxCol = -1;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    minRow = Math.min(minRow, i);
                    maxRow = Math.max(maxRow, i);
                    minCol = Math.min(minCol, j);
                    maxCol = Math.max(maxCol, j);
                }
            }
        }
        if (minRow == len) {
            return 0;
        }
        return (maxRow - minRow + 1) * (maxCol - minCol + 1);
    }

    public static void main(String[] args) {
        Question3195 solution = new Question3195();
        int[][] grid = { { 0, 1, 0 }, { 1, 0, 1 } };

        System.out.println(solution.minimumArea(grid));
    }
}
