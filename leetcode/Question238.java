package leetcode;

// Product of Array Except Self
import java.util.Arrays;

public class Question238 {
    private static int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeroCount = 0;

        for (int num : nums) {
            if (num != 0) {
                product *= num;
            } else {
                zeroCount++;
            }
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (zeroCount == 0) {
                result[i] = product / nums[i];
            } else if (zeroCount == 1) {
                result[i] = nums[i] == 0 ? product : 0;
            } else {
                result[i] = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // int[] nums = { 1, 2, 3, 4 };
        // int[] nums = { -1, 1, 0, -3, 3 };
        // int[] nums = { 0, 0 };
        int[] nums = { 0, 4, 0 };
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
