package leetcode;

public class Question59 {
    public static int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int count = 1, r = 0, c = 0, round = 1;
        while (count <= (n * n)) {
            if (c == round - 1 && r == round) {
                round++;
            }
            result[r][c] = count;
            if (c < n - round && r == round - 1) {
                c++;
            } else if (c == n - round && r < n - round) {
                r++;
            } else if (c > round - 1 && r == n - round) {
                c--;
            } else if (c == round - 1 && r > round) {
                r--;
            }
            count++;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] result = generateMatrix(n);
        Question48.printMatrix(result);
    }
}
