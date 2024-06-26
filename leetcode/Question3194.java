package leetcode;

// Minimum Average of Smallest and Largest Elements
import java.util.Arrays;

public class Question3194 {
    public double minimumAverage(int[] nums) {
        double minimum = Integer.MAX_VALUE;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int start = 0, end = nums.length - 1;
        while (start < end) {
            minimum = Math.min((nums[start++] + nums[end--]) / 2.0, minimum);
        }
        return minimum;
    }

    public static void main(String[] args) {
        Question3194 solution = new Question3194();
        int[] nums = { 7, 8, 3, 4, 15, 13, 4, 1 };

        System.out.println(solution.minimumAverage(nums));
    }
}
