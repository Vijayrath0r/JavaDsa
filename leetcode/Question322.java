package leetcode;

// Coin Change
import java.util.Arrays;

public class Question322 {
    private static int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0; // Base case: 0 coins to make amount 0

        for (int i = 0; i <= amount; i++) {
            if (dp[i] != Integer.MAX_VALUE) {
                for (int coin : coins) {
                    if (i <= amount - coin && i + coin <= amount) {
                        dp[i + coin] = Math.min(dp[i + coin], dp[i] + 1);
                    }
                }
            }
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        // int[] coins = { 1, 2, 5 };
        // int amount = 11;
        // int[] coins = { 2 };
        // int amount = 3;
        // int[] coins = { 1 };
        // int amount = 0;
        // int[] coins = { 186, 419, 83, 408 };
        // int amount = 6249;

        int[] coins = { 1, 2147483647 };
        int amount = 2;
        System.out.println(coinChange(coins, amount));
    }
}
