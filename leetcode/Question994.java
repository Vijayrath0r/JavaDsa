package leetcode;

// Rotting Oranges
import java.util.LinkedList;
import java.util.Queue;

public class Question994 {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int freshOranges = 0;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[] { i, j });
                } else if (grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        }
        if (freshOranges == 0)
            return 0;
        int[][] directions = { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 } };
        int totalMins = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            totalMins++;
            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int row = current[0];
                int col = current[1];
                for (int[] dir : directions) {
                    int newRow = row + dir[0];
                    int newCol = col + dir[1];
                    if (0 <= newRow && newRow < m && 0 <= newCol && newCol < n && grid[newRow][newCol] == 1) {
                        grid[newRow][newCol] = 2;
                        queue.offer(new int[] { newRow, newCol });
                        freshOranges--;
                    }
                }
            }
        }
        return freshOranges == 0 ? totalMins - 1 : -1;
    }

    public static void main(String[] args) {
        Question994 solution = new Question994();
        // int[][] grid = { { 2, 1, 1 }, { 1, 1, 0 }, { 0, 1, 1 } };
        // int[][] grid = { { 0, 2 } };
        // int[][] grid = { { 0 } };
        int[][] grid = { { 2, 1, 1 }, { 1, 1, 1 }, { 0, 1, 2 } };
        System.out.println(solution.orangesRotting(grid));
    }
}
