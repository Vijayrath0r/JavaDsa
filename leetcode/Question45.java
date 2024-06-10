package leetcode;

// Jump Game II
import java.util.Arrays;

public class Question45 {
    private static int jump(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return 0;
        }

        int[] dp = new int[len];
        Arrays.fill(dp, Integer.MAX_VALUE - 1);
        dp[0] = 0;

        for (int i = 0; i < len; i++) {
            int maxJump = Math.min(len - 1, i + nums[i]);
            for (int j = i + 1; j <= maxJump; j++) {
                dp[j] = Math.min(dp[j], dp[i] + 1);
            }
        }

        System.out.println(Arrays.toString(dp));
        return dp[len - 1];
    }

    public static void main(String[] args) {
        // int[] nums = { 2, 3, 1, 1, 4 };
        int[] nums = { 2, 3, 0, 1, 4 };
        System.out.println(jump(nums));
    }
}
