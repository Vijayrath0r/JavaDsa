package leetcode;

// XOR Queries of a Subarray
import java.util.Arrays;

public class Question1310 {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            int xorResult = arr[left];

            for (int j = left + 1; j <= right; j++) {
                xorResult ^= arr[j];
            }
            result[i] = xorResult;
        }

        return result;
    }

    public static void main(String[] args) {
        Question1310 solution = new Question1310();
        int[] arr = { 1, 3, 4, 8 };
        int[][] queries = { { 0, 1 }, { 1, 2 }, { 0, 3 }, { 3, 3 } };

        System.out.println(Arrays.toString(arr));
        int[] result = solution.xorQueries(arr, queries);
        System.out.println(Arrays.toString(result));
    }
}
