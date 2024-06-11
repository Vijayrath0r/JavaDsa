package leetcode;

// Minimum Size Subarray Sum
public class Question209 {
    private static int minSubArrayLen(int target, int[] nums) {
        int minCount = Integer.MAX_VALUE;
        int l = 0, r = 0;
        int windowSum = 0, len = nums.length;

        while (r < len) {
            windowSum += nums[r];
            r++;

            while (windowSum >= target) {
                minCount = Math.min(minCount, r - l);
                windowSum -= nums[l];
                l++;
            }
        }

        return minCount == Integer.MAX_VALUE ? 0 : minCount;
    }

    public static void main(String[] args) {
        int target = 11;
        // int[] nums = { 2, 3, 1, 2, 4, 3 };
        int[] nums = { 1, 2, 3, 4, 5 };
        System.out.println(minSubArrayLen(target, nums));
    }
}
