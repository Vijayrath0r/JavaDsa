package leetcode;

//Count Numbers with Unique Digits
public class Question357 {
    public static int count = 0;

    private static void helper(int i, int n, boolean[] usedNums) {
        if (i == n)
            return;

        for (int j = 0; j < 10; j++) {
            if (i == 0 && j == 0) {
                continue;
            }
            if (!usedNums[j]) {
                usedNums[j] = true;
                count++;
                helper(i + 1, n, usedNums);
                usedNums[j] = false;
            }
        }
    }

    private static int countNumbersWithUniqueDigits(int n) {
        if (n == 0)
            return 1;
        count = 0; // Reset the count at the start
        for (int j = 1; j < 10; j++) {
            boolean[] usedNums = new boolean[10];
            usedNums[j] = true;
            count++;
            helper(1, n, usedNums);
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(countNumbersWithUniqueDigits(n));
    }
}
