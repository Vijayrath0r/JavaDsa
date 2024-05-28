package leetcode;

// Unique Paths
public class Question62 {
    private static int helper(int i, int j, int m, int n, int[][] paths) {
        if (i == m || j == n) {
            return 0;
        }
        if (i == m - 1 && j == n - 1) {
            return 1;
        }
        if (paths[i][j] != 0) {
            return paths[i][j];
        }
        int sum = helper(i + 1, j, m, n, paths) + helper(i, j + 1, m, n, paths);
        if (paths[i][j] == 0 || paths[i][j] < sum) {
            paths[i][j] = sum;
        }
        return sum;
    }

    public static int uniquePaths(int m, int n) {
        int[][] paths = new int[m][n];
        return helper(0, 0, m, n, paths);
    }

    public static void main(String[] args) {
        // int m = 3, n = 7;
        int m = 19, n = 13;
        System.out.println(uniquePaths(m, n));
    }

}
