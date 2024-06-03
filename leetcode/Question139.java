package leetcode;

// Word Break
import java.util.ArrayList;
import java.util.List;

public class Question139 {
    private static boolean wordBreak(String s, List<String> wordDict) {
        int slen = s.length();
        boolean[] dp = new boolean[slen + 1];
        dp[0] = true;
        for (int i = 0; i < slen; i++) {
            if (dp[i] == false) {
                continue;
            }
            for (final String word : wordDict) {
                int wlen = word.length();
                if (i + wlen <= slen && s.substring(i, i + wlen).equals(word)) {
                    dp[i + wlen] = true;
                }
            }
        }
        return dp[slen];
    }

    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict = new ArrayList<String>() {
            {
                add("leet");
                add("code");
            }
        };

        // String s = "applepenapple";
        // List<String> wordDict = new ArrayList<String>() {
        // {
        // add("apple");
        // add("pen");
        // }
        // };

        // String s = "catsandog";
        // List<String> wordDict = new ArrayList<String>() {
        // {
        // add("cats");
        // add("dog");
        // add("sand");
        // add("and");
        // add("cat");
        // }
        // };
        System.out.println(wordBreak(s, wordDict));
    }
}