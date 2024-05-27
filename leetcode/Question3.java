package leetcode;

// Longest Substring Without Repeating Characters
import java.util.HashMap;

/**
 * Question3
 */
public class Question3 {
    private static int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (len == 0 || len == 1) {
            return len;
        }
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int maxLen = 0;
        int l = 0;
        for (int r = 0; r < len; r++) {
            char currentChar = s.charAt(r);
            if (charIndexMap.containsKey(currentChar)) {
                l = Math.max(charIndexMap.get(currentChar) + 1, l);
            }
            charIndexMap.put(currentChar, r);
            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        // String s = "abcabcbb";
        String s = "pwwkew";
        // String s = "au";
        // String s = "aab";
        // String s = "abba";
        // String s = "dvdf";
        System.out.println("-----------------");
        System.out.println(lengthOfLongestSubstring(s));
        System.out.println("-----------------");
    }
}