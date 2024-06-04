package leetcode;

// Triangle
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question120 {

    private static int helper(List<List<Integer>> triangle, int level, int idx, Integer[][] memo) {
        if (level == triangle.size() - 1) {
            return triangle.get(level).get(idx);
        }

        if (memo[level][idx] != null) {
            return memo[level][idx];
        }

        int leftSum = helper(triangle, level + 1, idx, memo);
        int rightSum = helper(triangle, level + 1, idx + 1, memo);

        memo[level][idx] = triangle.get(level).get(idx) + Math.min(leftSum, rightSum);

        return memo[level][idx];
    }

    private static int minimumTotal(List<List<Integer>> triangle) {
        Integer[][] memo = new Integer[triangle.size()][triangle.size()];

        return helper(triangle, 0, 0, memo);
    }

    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));

        System.out.println(minimumTotal(triangle));
    }
}
