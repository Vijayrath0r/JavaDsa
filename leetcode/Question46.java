package leetcode;

//Permutations
import java.util.ArrayList;
import java.util.List;

public class Question46 {

    private static void helper(List<Integer> arr, int[] nums, int n, List<List<Integer>> result) {
        if (arr.size() == n) {
            result.add(new ArrayList<>(arr));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!arr.contains(nums[i])) {
                arr.add(nums[i]);
                helper(arr, nums, n, result);
                arr.remove(arr.size() - 1);
            }
        }
    }

    private static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        helper(new ArrayList<Integer>(), nums, n, result);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        System.err.println(permute(nums));
    }
}
