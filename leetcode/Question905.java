package leetcode;

//Sort Array By Parity
import java.util.Arrays;

public class Question905 {
    private static int[] sortArrayByParity(int[] nums) {
        int left = 0, right = nums.length - 1, temp;
        while (left < right) {
            if (nums[left] % 2 != 0) {
                if (nums[right] % 2 == 0) {
                    temp = nums[right];
                    nums[right] = nums[left];
                    nums[left] = temp;
                    left++;
                    right--;
                } else {
                    right--;
                }
            } else {
                left++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        // int[] nums = { 3, 1, 2, 4 };
        // int[] nums = {0};
        int[] nums = { 1, 2 };
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
}
