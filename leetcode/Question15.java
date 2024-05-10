package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question15 {
    private static int[] sort(int[] nums, int n) {
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    private static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length, start = 0, end = n - 1;
        nums = sort(nums, n);
        if (nums[0] > 0) {
            return result;
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(
                "[[-4, 0, 4], [-4, 1, 3], [-3, -1, 4], [-3, 0, 3], [-3, 1, 2], [-2, -1, 3], [-2, 0, 2], [-1, -1, 2], [-1, 0, 1]]");
        System.out.println();
        while (start < end) {
            for (int i = start + 1; i < end; i++) {
                if (nums[start] + nums[i] + nums[end] == 0) {
                    result.add(Arrays.asList(nums[start], nums[i], nums[end]));
                }
            }
            if (nums[end] + nums[start] < 0) {
                start++;

            } else {
                end--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // int[] nums = { -1, 0, 1, 2, -1, -4 };
        // int[] nums = { 0,1,1 };
        // int[] nums = { 0, 0, 0 };
        // int[] nums = { 1, 1, -2 };
        // int[] nums = { 0, 0, 0, 0 };
        int[] nums = { -1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4 };
        System.out.println(threeSum(nums));
    }
}
