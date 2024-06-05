package leetcode;

// Max Consecutive Ones III
public class Question1004 {
    private static int longestOnes(int[] nums, int k) {
        int l = 0, r = 0;
        int zeroCount = 0;
        int max = 0;

        while (r < nums.length) {
            if (nums[r] == 0) {
                zeroCount++;
            }

            while (zeroCount > k) {
                if (nums[l] == 0) {
                    zeroCount--;
                }
                l++;
            }

            max = Math.max(max, r - l + 1);
            r++;
        }

        return max;
    }

    public static void main(String[] args) {
        // int[] nums = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        // int k = 2;

        // int[] nums = { 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 };
        // int k = 3;

        int[] nums = { 0, 0, 0, 0 };
        int k = 0;

        // int[] nums = { 0, 0, 1, 1, 1, 0, 0 };
        // int k = 0;
        System.out.println(longestOnes(nums, k));
    }
}
