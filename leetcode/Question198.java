package leetcode;

// House Robber
import java.util.Arrays;

public class Question198 {
    private static int rob(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }
        if (len == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int[] dp = new int[len];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]); // Correctly initialize the second house

        for (int i = 2; i < len; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]); // Correctly calculate dp[i]
        }
        System.out.println(Arrays.toString(dp));
        return dp[len - 1];
    }

    public static void main(String[] args) {
        // int[] nums = { 1, 2, 3, 1 };
        // int[] nums = { 2, 7, 9, 3, 1 };
        int[] nums = { 2, 1, 1, 2 };
        System.out.println(rob(nums));
    }
}
