package leetcode;

// Non-overlapping Intervals
import java.util.Arrays;

public class Question435 {
    private static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int removeCount = 0, end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < end) {
                removeCount++;
            } else {
                end = intervals[i][1];
            }
        }
        return removeCount;
    }

    public static void main(String[] args) {
        // int[][] intervals = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 1, 3 } };
        // int[][] intervals = { { 1, 2 }, { 1, 2 }, { 1, 2 } };
        // int[][] intervals = { { 1, 2 }, { 2, 3 } };
        // int[][] intervals = { { 1, 100 }, { 11, 22 }, { 1, 11 }, { 2, 12 } };
        int[][] intervals = { { 0, 2 }, { 1, 3 }, { 2, 4 }, { 3, 5 }, { 4, 6 } };
        System.out.println(eraseOverlapIntervals(intervals));
    }
}
