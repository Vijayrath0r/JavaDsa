package leetcode;

//Maximum Subarray
public class Question53 {
    private static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            maxSum = Math.max(maxSum, sum);
            if (sum <= 0) {
                sum = 0; // reset sum if it becomes zero or negative
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        // int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 }; // 6
        // int[] nums = { 1 }; //1
        int[] nums = { 5, 4, -1, 7, 8 }; // 23
        System.out.println(maxSubArray(nums));
    }
}
