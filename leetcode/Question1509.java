package leetcode;

// Minimum Difference Between Largest and Smallest Value in Three Moves
import java.util.Arrays;

public class Question1509 {
    public int minDifference(int[] nums) {
        int len = nums.length;
        if (len < 4) {
            return 0;
        }
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= 3; i++) {
            minDiff = Math.min(minDiff, nums[len - 1 - (3 - i)] - nums[i]);
        }

        return minDiff;
    }

    public static void main(String[] args) {
        Question1509 solution = new Question1509();
        // int[] nums = { 5, 3, 2, 4 };
        // int[] nums = { 1, 5, 0, 10, 14 };
        int[] nums = { 6, 6, 0, 1, 1, 4, 6 };

        System.out.println(solution.minDifference(nums));
    }
}
