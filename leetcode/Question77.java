package leetcode;

// Combinations
import java.util.ArrayList;
import java.util.List;

public class Question77 {
    private static void generateCombinations(int start, int n, int k, List<Integer> current,List<List<Integer>> result) {
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i <= n; i++) {
            current.add(i);
            generateCombinations(i + 1, n, k, current, result);
            current.remove(current.size() - 1);
        }
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        generateCombinations(1, n, k, new ArrayList<>(), result);
        return result;
    }

    public static void main(String[] args) {
        // int n = 4, k = 2;
        int n = 1, k = 1;
        System.out.println(combine(n, k));
    }
}
