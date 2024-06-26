package leetcode;

// Two Sum
import java.util.Arrays;
import java.util.HashMap;

public class Question1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(nums[i])) {
                return new int[] { map.get(nums[i]), i };
            }
            map.put(complement, i);
        }
        return nums;
    }

    public static void main(String[] args) {
        Question1 solution = new Question1();
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }
}
