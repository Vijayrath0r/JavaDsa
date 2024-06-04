package leetcode;

// Longest Palindrome
import java.util.HashMap;

public class Question409 {
    private static int longestPalindrome(String s) {
        if (s.length() == 1) {
            return 1;
        }

        HashMap<Character, Integer> ht = new HashMap<>();
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (ht.containsKey(ch)) {
                count += 2;
                ht.remove(ch);
            } else {
                ht.put(ch, 1);
            }
        }

        return ht.isEmpty() ? count : count + 1;
    }

    public static void main(String[] args) {
        // String s = "abccccdd";
        String s = "abab";
        System.out.println(longestPalindrome(s));
    }
}
