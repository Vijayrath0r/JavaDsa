package leetcode;

// 5. Longest Palindromic Substring
public class Question5 {
    int resultStart = 0;
    int resultLength = 0;

    public String longestPalindrome(String s) {
        int strLength = s.length();
        if (strLength < 2) {
            return s;
        }
        resultStart = 0;
        resultLength = 0;
        for (int start = 0; start < strLength - 1; start++) {
            expandRange(s, start, start);
            expandRange(s, start, start + 1);
        }
        return s.substring(resultStart, resultStart + resultLength);
    }

    private void expandRange(String str, int begin, int end) {
        while (begin >= 0 && end < str.length() && str.charAt(begin) == str.charAt(end)) {
            begin--;
            end++;
        }
        if (resultLength < end - begin - 1) {
            resultStart = begin + 1;
            resultLength = end - begin - 1;
        }
    }

    public static void main(String[] args) {
        Question5 solution = new Question5();
        // String s = "bab";
        String s = "cbbd";

        System.out.println(solution.longestPalindrome(s));
    }
}
