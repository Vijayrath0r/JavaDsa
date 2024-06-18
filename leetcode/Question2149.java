package leetcode;

// Rearrange Array Elements by Sign
import java.util.Arrays;

public class Question2149 {
    private static int[] rearrangeArray(int[] nums) {
        int len = nums.length;
        int posIdx = 0, negIdx = 1;
        int[] result = new int[len];

        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) {
                result[posIdx] = nums[i];
                posIdx += 2;
            } else {
                result[negIdx] = nums[i];
                negIdx += 2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // int[] nums = { 3, 1, -2, -5, 2, -4 };
        int[] nums = { -1, -2, -3, -4, 1, 2, 3, 4 };
        // int[] nums = { -1, 1 };
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }
}
