package leetcode;

// Longest Continuous Increasing Subsequence
public class Question674 {
    private static int findLengthOfLCIS(int[] nums) {
        int count = 1, maxCount = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 1;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        // int[] nums = { 1, 3, 5, 4, 7 };
        // int[] nums = { 2, 2, 2, 2, 2 };
        int[] nums = { 2, 1 };
        System.out.println(findLengthOfLCIS(nums));
    }
}
