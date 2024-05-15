package leetcode;

//Permutations II
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question47 {
    private static void helper(List<Integer> arr, int[] nums, boolean[] used, List<List<Integer>> result) {
        if (arr.size() == nums.length) {
            result.add(new ArrayList<>(arr));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                    continue;
                }
                arr.add(nums[i]);
                used[i] = true;
                helper(arr, nums, used, result);
                arr.remove(arr.size() - 1);
                used[i] = false;
            }
        }
    }

    private static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        helper(new ArrayList<Integer>(), nums, used, result);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2 };
        // int[] nums = { 1, 2, 3 };
        System.err.println(permuteUnique(nums));
    }
}
