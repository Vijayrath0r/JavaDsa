package leetcode;

// Maximum Average Subarray I
public class Question643 {
    private static double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum / k;
    }

    public static void main(String[] args) {
        // int[] nums = { 1, 12, -5, -6, 50, 3 };
        // int k = 4;

        int[] nums = { 0, 4, 0, 3, 2 };
        int k = 1;
        System.out.println(findMaxAverage(nums, k));
    }
}
