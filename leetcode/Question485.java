package leetcode;
// Max Consecutive Ones
public class Question485 {
    private static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxcount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                maxcount = Math.max(maxcount, count);
                count = 0;
            }
        }
        return Math.max(maxcount, count);
    }

    public static void main(String[] args) {
        // int[] nums = { 1, 1, 0, 1, 1, 1 };
        int[] nums = { 1, 0, 1, 1, 0, 1 };
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
