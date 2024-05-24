package leetcode;

// Decode Ways

public class Question91 {
    static int result = 0;

    private static int helper(String s, int idx, int len, Integer[] memo) {
        if (idx >= len) {
            return 1;
        }
        if (memo[idx] != null) {
            return memo[idx];
        }
        char currentChar = s.charAt(idx);
        if (currentChar == '0') {
            return 0;
        }

        int count = helper(s, idx + 1, len, memo);
        if (idx + 1 < len) {
            char nextChar = s.charAt(idx + 1);
            int val = (currentChar - '0') * 10 + (nextChar - '0');
            if (val <= 26) {
                count += helper(s, idx + 2, len, memo);
            }
        }
        memo[idx] = count;
        return count;
    }

    private static int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Integer[] memo = new Integer[s.length()];
        return helper(s, 0, s.length(), memo);
    }

    public static void main(String[] args) {
        // String s = "11106";
        // String s = "12";
        // String s = "226";
        // String s = "06";
        String s = "11111111111";
        System.out.println(numDecodings(s));
    }
}
