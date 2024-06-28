package leetcode;

// Single Element in a Sorted Array
public class Question540 {
    public int singleNonDuplicate(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (mid % 2 == 1) {
                mid--;
            }
            if (nums[mid] == nums[mid + 1]) {
                start = mid + 2;
            } else {
                end = mid;
            }
        }
        return nums[start];
    }

    public static void main(String[] args) {
        Question540 soluton = new Question540();
        // int[] nums = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        int[] nums = { 3, 3, 7, 7, 10, 11, 11 };

        System.out.println(soluton.singleNonDuplicate(nums));
    }
}
