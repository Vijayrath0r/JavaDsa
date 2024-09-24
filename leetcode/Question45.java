package leetcode;

// Jump Game II

public class Question45 {
    private static int jump(int[] nums) {
        int currentReach = 0;
        int currentMax = 0;
        int jumps = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            currentMax = Math.max(currentMax, i + nums[i]);

            if (i == currentReach) {
                jumps++;
                currentReach = currentMax;
            }
        }
        return jumps;
    }

    public static void main(String[] args) {
        // int[] nums = { 2, 3, 1, 1, 4 };
        int[] nums = { 2, 3, 0, 1, 4 };
        System.out.println(jump(nums));
    }
}
