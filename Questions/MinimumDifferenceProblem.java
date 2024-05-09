import java.util.Arrays;

public class MinimumDifferenceProblem {
    private static int[] sort(int[] nums, int n) {
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    private static int[] getminimumslot(int[] nums, int m) {
        int min = 0, ansMin = Integer.MAX_VALUE, start = 0;
        int[] ans = new int[m];
        int n = nums.length;
        nums = sort(nums, n);
        for (int i = 0; i <= n - m; i++) {
            min = nums[i + m - 1] - nums[i];
            if (min < ansMin) {
                ansMin = min;
                start = i;
            }
        }
        for (int i = start; i < start + m; i++) {
            ans[i - start] = nums[i];
        }
        System.out.println(ansMin);
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 4, 7, 10, 5, 13, 19, 21, 24 };
        int m = 4; // ans = {3,4,7,5} mini = 7-3 = 4

        // int[] nums = { 1, 13, 15, 10, 3, 8, 29, 12, 19 };
        // int m = 5; // ans = {13,15,10,8,12} mini = 15-8 = 7
        System.out.println(Arrays.toString(getminimumslot(nums, m)));
    }

}
