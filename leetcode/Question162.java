package leetcode;

// Find Peak Element
public class Question162 {
    private static int findPeakElement(int[] nums) {
        int len = nums.length;
        for (int i = 1; i < len - 1; i++) {
            if (nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) {
                return i;
            }
        }
        if (len > 1 && nums[0] > nums[1] && nums[len - 2] > nums[len - 1]) {
            return 0;
        }
        return len - 1;
    }

    public static void main(String[] args) {
        // int[] nums = { 1, 2, 3, 1 };
        int[] nums = { 1, 2 };
        System.out.println(findPeakElement(nums));
    }
}
