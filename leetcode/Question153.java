package leetcode;

// Find Minimum in Rotated Sorted Array
public class Question153 {
    private static int findMin(int[] nums) {
        int start = 0, end = nums.length - 1, min = nums[0];
        while (start < end) {
            int mid = (start + end) / 2;
            if (min > nums[mid]) {
                min = nums[mid];
            }
            if (nums[start] <= nums[mid] && nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        if (nums[start] < min) {
            min = nums[start];
        }
        return min;
    }

    public static void main(String[] args) {
        // int[] nums = { 3, 4, 5, 1, 2 };
        // int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        // int[] nums = { 11, 13, 15, 17 };
        int[] nums = { 2, 1 };
        System.out.println("*******************************************************************");
        System.out.println(findMin(nums));
        System.out.println("*******************************************************************");
    }
}
