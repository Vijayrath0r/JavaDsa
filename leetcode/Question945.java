package leetcode;

// Minimum Increment to Make Array Unique
import java.util.Arrays;

public class Question945 {
    private static int minIncrementForUnique(int[] nums) {
        int inc = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                inc += nums[i - 1] - nums[i] + 1;
                nums[i] = nums[i - 1] + 1;
            }
        }
        return inc;
    }

    public static void main(String[] args) {
        // int[] nums = { 1, 2, 2 };
        int[] nums = { 3, 2, 1, 2, 1, 7 };
        System.out.println(minIncrementForUnique(nums));
    }
}
