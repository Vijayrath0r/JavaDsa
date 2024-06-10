package leetcode;

import java.util.Arrays;

/**
 * Question1051 Height Checker
 */
public class Question1051 {
    private static int heightChecker(int[] heights) {
        int[] sortedHeights = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sortedHeights);

        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sortedHeights[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] heights = { 1, 1, 4, 2, 1, 3 };
        System.out.println(heightChecker(heights));
    }
}