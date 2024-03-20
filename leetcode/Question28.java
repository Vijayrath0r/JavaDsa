package leetcode;

public class Question28 {
    public static int strStr(String haystack, String needle) {
        boolean isReturn = true;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                isReturn = true;
                for (int j = 1; j < needle.length(); j++) {
                    if (i + j == haystack.length() || haystack.charAt(i + j) != needle.charAt(j)) {
                        isReturn = false;
                        break;
                    }
                }
                if (isReturn) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // String haystack = "sadbutsad", needle = "sad";
        String haystack = "aaa", needle = "aaaa";
        System.out.println(strStr(haystack, needle));
    }
}
