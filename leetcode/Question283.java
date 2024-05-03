package leetcode;

import java.util.Arrays;

/**
 * Question283
 */
public class Question283 {

    public static void moveZeroes(int[] nums) {
        int i = 0, j = 0;
        while (j < nums.length && i < nums.length) {
            if (nums[i] == 0) {
                if (nums[j] != 0 && j > i) {
                    nums[i] = nums[j];
                    nums[j] = 0;
                }
                j++;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        // int[] nums = { 0, 1, 0, 3, 12 };
        // int[] nums = { 0 };
        // int[] nums = { 1 };
        int[] nums = { 1, 0 };
        moveZeroes(nums);
    }
}