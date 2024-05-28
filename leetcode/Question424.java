package leetcode;

// Longest Repeating Character Replacement
import java.util.HashMap;

public class Question424 {
    private static int characterReplacement(String s, int k) {
        int l = 0, r = 0, maxLen = 0, maxOccurence = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        while (r < s.length()) {
            char currentChar = s.charAt(r);
            int currentVal = hm.getOrDefault(currentChar, 0);
            hm.put(currentChar, currentVal + 1);
            maxOccurence = Math.max(maxOccurence, currentVal + 1);
            if (r - l + 1 - maxOccurence > k) {
                currentChar = s.charAt(l);
                hm.compute(currentChar, (key, val) -> val = val - 1);
                l++;
            }
            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        // String s = "AABABBA";
        // int k = 1;
        System.out.println(characterReplacement(s, k));
    }
}
