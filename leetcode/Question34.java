package leetcode;
//Find First and Last Position of Element in Sorted Array
import java.util.Arrays;

public class Question34 {
    private static int[] searchRange(int[] nums, int target) {
        int[] result = { -1, -1 };
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                if (nums[start] == target && nums[end] == target) {
                    result[0] = start;
                    result[1] = end;
                    return result;
                } else if (nums[start] != target) {
                    start++;
                } else if (nums[end] != target) {
                    end--;
                }
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // int[] nums = { 5, 7, 7, 8, 8, 10 };
        // int target = 8;
        // int target = 6;
        int[] nums = {};
        int target = 0;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}
