package leetcode;

public class Question27 {
    public static int removeElement(int[] nums, int val) {
        int last = nums.length - 1;
        for (int i = 0; i <= last; i++) {
            if (nums[last] == val) {
                last--;
                i--;
                continue;
            }
            if (nums[i] == val) {
                nums[i] = nums[last];
                last--;
            }
        }
        if (last == 0 && nums[last] == val) {
            return last;
        } else {
            return last + 1;
        }
    }

    public static void main(String[] args) {
        // int[] nums = { 3, 2, 2, 3 };
        // int val = 3;
        int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;
        // int[] nums = { 1 };
        // int val = 1;
        // int[] nums = { 3 };
        // int val = 2;
        System.out.println(removeElement(nums, val));
    }
}
