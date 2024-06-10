package leetcode;

// Rotate Array
import java.util.Arrays;

public class Question189 {
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }

    private static void rotate(int[] nums, int k) {
        int len = nums.length;
        if (len == 1 || k % len == 0) {
            return;
        }
        k = k % len;
        reverse(nums, 0, len - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, len - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        // int[] nums = { -1 };
        // int k = 2;
        rotate(nums, k);
    }
}
