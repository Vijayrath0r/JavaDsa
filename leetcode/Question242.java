package leetcode;

// Valid Anagram
public class Question242 {
    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] alphabets = new int[26];
        for (final char c : s.toCharArray()) {
            alphabets[c - 'a']++;
        }
        for (final char c : t.toCharArray()) {
            if (alphabets[c - 'a'] == 0) {
                return false;
            }
            alphabets[c - 'a']--;
        }
        return true;
    }

    public static void main(String[] args) {
        // String s = "anagram", t = "nagaram";
        // String s = "rat", t = "car";
        String s = "a", t = "a";
        System.out.println(isAnagram(s, t));
    }
}
