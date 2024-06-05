package leetcode;

// Longest Subarray of 1's After Deleting One Element
public class Question1493 {
    private static int longestSubarray(int[] nums) {
        int lastCount = -1, currentCount = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currentCount++;
            } else {
                max = Math.max(max, lastCount + currentCount);
                lastCount = currentCount;
                currentCount = 0;
            }
        }
        return Math.max(max, lastCount + currentCount);
    }

    public static void main(String[] args) {
        // int[] nums = { 1, 1, 0, 1 };
        // int[] nums = { 0, 1, 1, 1, 0, 1, 1, 0, 1 };
        int[] nums = { 1, 1, 1 };
        System.out.println(longestSubarray(nums));
    }
}
