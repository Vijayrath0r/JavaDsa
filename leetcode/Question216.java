package leetcode;

// Combination Sum III
import java.util.ArrayList;
import java.util.List;

public class Question216 {
    private static List<List<Integer>> result = new ArrayList<>();

    private static void helper(int start, int level, int sum, int n, int k, List<Integer> list, boolean[] check) {
        if (level > k || sum > n) {
            return;
        }
        if (level == k) {
            if (sum == n) {
                result.add(new ArrayList<Integer>(list));
            }
            return;
        }
        for (int i = start; i <= 9; i++) {
            if (!check[i - 1]) {
                check[i - 1] = true;
                list.add(i);
                helper(i + 1, level + 1, sum + i, n, k, list, check);
                list.remove(list.size() - 1);
                check[i - 1] = false;
            }
        }
    }

    private static List<List<Integer>> combinationSum3(int k, int n) {
        result.clear();
        helper(1, 0, 0, n, k, new ArrayList<>(), new boolean[9]);
        return result;
    }

    public static void main(String[] args) {
        // int k = 3, n = 7;
        int k = 3, n = 9;
        System.out.println(combinationSum3(k, n));
    }
}
