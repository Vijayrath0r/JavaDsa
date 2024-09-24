package geeksforgeeks;
// Minimum Jumps

import java.util.Arrays;

public class MinimumJumps {
    static int minJumps(int[] arr) {
        int len = arr.length;
        int[] dp = new int[len];
        Arrays.fill(dp, Integer.MAX_VALUE - 1);
        dp[0] = 0;

        for (int i = 0; i < len; i++) {
            if (arr[i] == 0) {
                continue;
            }
            for (int j = i + 1; j <= i + arr[i] && j < len; j++) {
                dp[j] = Math.min(dp[j], dp[i] + 1);
            }
        }
        return dp[len - 1] == Integer.MAX_VALUE - 1 ? -1 : dp[len - 1];
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
        // int arr[] = { 1, 4, 3, 2, 6, 7 };
        // int arr[] = { 0, 10, 20 };
        // int arr[] = { 4, 3, 2, 1, 0, 1 };
        System.out.println(minJumps(arr));
    }
}
