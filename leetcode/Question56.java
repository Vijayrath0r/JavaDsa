// 56. Merge Intervals
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question56 {
    public static int[][] merge(int[][] intervals) {
        List<int[]> validIntervals = new ArrayList<>();
        int max = 0;
        int min = 0;
        for (int i = 0; i < intervals.length; i++) {
            min = intervals[i][0];
            max = intervals[i][1];
            validIntervals.add(new int[] { min, max });
        }
        int[][] reducedIntervals = new int[validIntervals.size()][2];
        for (int i = 0; i < validIntervals.size(); i++) {
            reducedIntervals[i] = validIntervals.get(i);
        }
        return reducedIntervals;
    }

    public static void main(String[] args) {
        // int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        // int[][] intervals = {{1,4},{0,4}};
        int[][] intervals = { { 1, 4 }, { 0, 1 } };
        System.out.println(Arrays.deepToString(merge(intervals)));
    }
}
