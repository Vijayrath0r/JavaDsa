package leetcode;

// Combination Sum
import java.util.ArrayList;
import java.util.List;

public class Question39 {
    private static void helper(List<List<Integer>> result, List<Integer> list, int sum, int idx, int[] candidates,
            int target) {
        if (sum > target) {
            return;
        }
        if (sum == target) {
            result.add(new ArrayList<>(list));
        }
        for (int i = idx; i < candidates.length; i++) {
            list.add(candidates[i]);
            helper(result, list, sum + candidates[i], i, candidates, target);
            list.remove(list.size() - 1);
        }
    }

    private static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        helper(result, new ArrayList<>(), 0, 0, candidates, target);
        return result;
    }

    public static void main(String[] args) {
        int[] candidates = { 2, 3, 6, 7 };
        int target = 7;
        System.out.println(combinationSum(candidates, target));
    }
}
