package Recursion;

public class MovingInMaze {
    public static int countPath(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        // going down
        int downPaths = countPath(i + 1, j, n, m);
        // goint right
        int rightPath = countPath(i, j + 1, n, m);
        return downPaths + rightPath;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        int totalPaths = countPath(0, 0, n, m);
        System.out.println("Total Paths - " + totalPaths);
    }
}
