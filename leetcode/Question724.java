package leetcode;

// Find Pivot Index
public class Question724 {
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        int[] leftSum = new int[len];
        int[] righSum = new int[len];
        int sum = 0;
        for (int i = 0; i < len; i++) {
            leftSum[i] = sum + nums[i];
            sum = leftSum[i];
        }
        sum = 0;
        for (int i = len - 1; i >= 0; i--) {
            righSum[i] = sum + nums[i];
            sum = righSum[i];
        }
        for (int i = 0; i < len; i++) {
            if (leftSum[i] == righSum[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Question724 solution = new Question724();
        int[] nums = { -1, -1, -1, -1, -1, 0 };

        System.out.println(solution.pivotIndex(nums));

    }
}
