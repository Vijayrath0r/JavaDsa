package leetcode;

// 40. Combination Sum II
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question40 {
    public void helper(int[] candidates, int target, List<Integer> combination, List<List<Integer>> results, int start,
            int sum) {
        if (sum == target) {
            results.add(new ArrayList<>(combination));
            return;
        }
        if (sum > target) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if (candidates[i] > target - sum) {
                break;
            }

            combination.add(candidates[i]);
            helper(candidates, target, combination, results, i + 1, sum + candidates[i]);
            combination.remove(combination.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates, target, new ArrayList<>(), results, 0, 0);
        return results;
    }

    public static void main(String[] args) {
        Question40 solution = new Question40();
        // int[] candidates = { 10, 1, 2, 7, 6, 1, 5 };
        // int target = 8;

        int[] candidates = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1 };
        int target = 30;

        System.out.println(solution.combinationSum2(candidates, target));
    }
}
