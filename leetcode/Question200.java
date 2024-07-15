package leetcode;

// Number of Islands
public class Question200 {
    private void dfs(char[][] grid, int i, int j, int m, int n) {
        if (0 <= i && i < m && 0 <= j && j < n && grid[i][j] != '0') {
            grid[i][j] = '0';
            dfs(grid, i - 1, j, m, n);
            dfs(grid, i, j - 1, m, n);
            dfs(grid, i + 1, j, m, n);
            dfs(grid, i, j + 1, m, n);
        }
    }

    public int numIslands(char[][] grid) {
        int count = 0, m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j, m, n);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Question200 solution = new Question200();
        // char[][] grid = {
        // { '1', '1', '1', '1', '0' },
        // { '1', '1', '0', '1', '0' },
        // { '1', '1', '0', '0', '0' },
        // { '0', '0', '0', '0', '0' }
        // };

        char[][] grid = {
                { '1', '1', '0', '0', '0' },
                { '1', '1', '0', '1', '0' },
                { '0', '0', '1', '0', '0' },
                { '0', '0', '0', '1', '1' }
        };
        System.out.println(solution.numIslands(grid));
    }
}
