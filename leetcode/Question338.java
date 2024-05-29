package leetcode;

// Counting Bits
import java.util.Arrays;

public class Question338 {
    private static int helper(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    private static int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            result[i] = helper(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 10; // [0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2]
        System.out.println(Arrays.toString(countBits(n)));
    }
}
