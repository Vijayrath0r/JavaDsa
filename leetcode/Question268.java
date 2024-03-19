package leetcode;

public class Question268 {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        boolean haveZero = false;
        int sum = (n * (n + 1)) / 2;
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
            if (nums[i] == 0) {
                haveZero = true;
            }
        }
        if (!haveZero) {
            return 0;
        } else if (sum < 1) {
            return n + 1;
        } else {
            return sum;
        }
    }

    public static void main(String[] args) {
        // int[] arr = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        // int[] arr = {0,1 };
        // int[] arr = { 1 };
        int[] arr = { 1, 2 };
        System.out.println(missingNumber(arr));
    }
}
