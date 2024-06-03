package leetcode;

// Is Subsequence
public class Question392 {
    private static boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }
        int sIdx = 0;
        int sLen = s.length();
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(sIdx) == t.charAt(i)) {
                sIdx++;
                if (sIdx == sLen) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // String s = "abc", t = "ahbgdc";
        // String s = "axc", t = "ahbgdc";
        String s = "", t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
}
