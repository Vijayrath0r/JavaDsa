package leetcode;

// Coin Change
import java.util.Arrays;

public class Question322 {
    private static int coinChange(int[] coins, int amount) {
        int idx = coins.length - 1;
        int steps = 0;
        Arrays.sort(coins);
        while (amount > 0 && idx >= 0) {
            int temp = amount - coins[idx];
            if (temp >= 0) {
                amount = amount - coins[idx];
                steps++;
            } else {
                idx--;
            }
        }
        return amount == 0 ? steps : -1;
    }

    public static void main(String[] args) {
        // int[] coins = { 1, 2, 5 };
        // int amount = 11;
        // int[] coins = { 2 };
        // int amount = 3;
        // int[] coins = { 1 };
        // int amount = 0;
        int[] coins = { 186, 419, 83, 408 };
        int amount = 6249;
        System.out.println(coinChange(coins, amount));
    }
}
