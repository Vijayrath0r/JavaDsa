// 56. Merge Intervals
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question56 {
    private static int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();

        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));

        for (int[] interval : intervals)
            if (ans.isEmpty() || ans.get(ans.size() - 1)[1] < interval[0])
                ans.add(interval);
            else
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], interval[1]);

        return ans.toArray(int[][]::new);
    }

    public static void main(String[] args) {
        // int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        // int[][] intervals = {{1,4},{0,4}};
        int[][] intervals = { { 1, 4 }, { 0, 1 } };
        System.out.println(Arrays.deepToString(merge(intervals)));
    }
}
