package leetcode;

public class Question14 {
    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length - 1; j++) {
                if (strs[j].length() <= i || strs[j + 1].length() <= i) {
                    return result;
                }
                if (strs[j].charAt(i) != strs[j + 1].charAt(i)) {
                    return result;
                }
            }
            result += strs[0].charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        // String[] strs = { "flower", "flow", "flight" };
        // String[] strs = { "abcd", "aabccd", "abcde" };
        // String[] strs = { "dog","racecar","car" };
        String[] strs = { "ab", "a" };
        System.out.println(longestCommonPrefix(strs));
    }
}
