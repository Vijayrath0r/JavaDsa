package leetcode;

public class Question62 {
    private static int helper(int i, int j, int m, int n) {
        if (i == m || j == n) {
            return 0;
        }
        if (i == m - 1 && j == n - 1) {
            return 1;
        }
        int goDown = helper(i + 1, j, m, n);
        int goRight = helper(i, j + 1, m, n);
        return goDown + goRight;
    }

    public static int uniquePaths(int m, int n) {
        return helper(0, 0, m, n);
    }

    public static void main(String[] args) {
        // int m = 3, n = 7;
        int m = 19, n = 13;
        System.out.println(uniquePaths(m, n));
    }

}
