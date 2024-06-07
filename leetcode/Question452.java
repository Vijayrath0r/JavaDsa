package leetcode;

// Minimum Number of Arrows to Burst Balloons
import java.util.Arrays;

public class Question452 {
    private static int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int arrowCount = 1, currentEnd = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > currentEnd) {
                currentEnd = points[i][1];
                arrowCount++;
            }
        }
        return arrowCount;
    }

    public static void main(String[] args) {
        // int[][] points = { { 10, 16 }, { 2, 8 }, { 1, 6 }, { 7, 12 } };
        // int[][] points = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 } };
        int[][] points = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 } };
        System.out.println(findMinArrowShots(points));
    }
}
