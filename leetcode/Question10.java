package leetcode;

public class Question10 {
    private static boolean helper(String s, String p, int sIdx, int pIdx, char selectedChar) {
        if (sIdx > s.length() - 1 && pIdx > p.length() - 1) {
            return true;
        } else if (sIdx > s.length() - 1 && (pIdx + 1) < p.length() && p.charAt(pIdx + 1) == '*'
                && (pIdx + 2) == p.length()) {
            return true;

        } else if (pIdx > p.length() - 1 || sIdx > s.length() - 1) {
            return false;
        }
        // System.out.println("s value - " + s.charAt(sIdx));
        // System.out.println("p value - " + p.charAt(pIdx));
        if (p.charAt(pIdx) == '.') {
            if ((pIdx + 1) < p.length() && p.charAt(pIdx + 1) == '*') {
                if ((pIdx + 2) < p.length() && p.charAt(pIdx + 2) == s.charAt(sIdx)) {
                    // System.out.println("In dot");
                    return helper(s, p, sIdx + 1, pIdx + 3, ' ');
                } else {
                    return helper(s, p, sIdx + 1, pIdx, ' ');
                }
            } else {
                return helper(s, p, sIdx + 1, pIdx + 1, ' ');
            }
        } else if (p.charAt(pIdx) == '*') {

        } else {
            if (s.charAt(sIdx) == p.charAt(pIdx) && selectedChar == ' ') {
                if ((pIdx + 1) < p.length() && p.charAt(pIdx + 1) == '*') {
                    return helper(s, p, sIdx + 1, pIdx, ' ');
                } else {
                    return helper(s, p, sIdx + 1, pIdx + 1, ' ');
                }
            } else if (s.charAt(sIdx) == selectedChar) {
                return helper(s, p, sIdx + 1, pIdx, selectedChar);
            } else {
                if (pIdx + 1 < p.length() - 1) {
                    if (p.charAt(pIdx + 1) == '*') {
                        if (selectedChar != ' ') {
                            // System.out.println("In else");
                            return helper(s, p, sIdx + 1, pIdx + 2, ' ');
                        } else {
                            return helper(s, p, sIdx, pIdx + 2, selectedChar);
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }

            }
        }
        return false;
    }

    private static boolean isMatch(String s, String p) {
        return helper(s, p, 0, 0, ' ');
    }

    public static void main(String[] args) {
        // String s = "aa", p = "a";
        // String s = "aa", p = "aa";
        // String s = "aa", p = "a*";
        // String s = "aa", p = ".a";
        // String s = "aab", p = "c*a*b";
        // String s = "aasdfsdfsdf", p = "ab*";
        // String s = "aasdfsdfsdf", p = ".*";
        // String s = "ab", p = ".*c";
        // String s = "abfsdfsdfsdfc", p = ".*c";
        // String s = "abfsdfsdfsdfcab", p = ".*cab";
        String s = "aaa", p = "a*a"; // true
        System.out.println(isMatch(s, p));
    }
}
