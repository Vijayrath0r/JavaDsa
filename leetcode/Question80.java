package leetcode;

// Remove Duplicates from Sorted Array II
import java.util.Arrays;

public class Question80 {
    private static int removeDuplicates(int[] nums) {
        int p1 = 0, pVal = Integer.MIN_VALUE, pCount = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != pVal) {
                nums[p1] = nums[i];
                pVal = nums[i];
                p1++;
                pCount = 1;
            } else if (nums[i] == pVal && pCount < 2) {
                nums[p1] = nums[i];
                pCount++;
                p1++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return p1;
    }

    public static void main(String[] args) {
        // int[] nums = { 1, 1, 1, 2, 2, 3 }; // 5
        int[] nums = { 0, 0, 1, 1, 1, 1, 2, 3, 3 }; // 7
        System.out.println(removeDuplicates(nums));
    }
}
