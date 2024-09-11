package leetcode;

// 3024. Type of Triangle
import java.util.Arrays;

public class Question3024 {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);

        if (nums[2] >= nums[0] + nums[1]) {
            return "none";
        }

        if (nums[0] == nums[1] && nums[1] == nums[2]) {
            return "equilateral";
        }

        if (nums[0] == nums[1] || nums[1] == nums[2]) {
            return "isosceles";
        }

        return "scalene";
    }

    public static void main(String[] args) {
        Question3024 solution = new Question3024();
        // int[] nums = { 3, 3, 3 };
        int[] nums = { 5, 3, 8 };

        System.out.println(solution.triangleType(nums));
    }
}
