package leetcode;

// String to Integer (atoi)
public class Question8 {
    private static int myAtoi(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int i = 0;
        int n = s.length();

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        if (i == n) {
            return 0;
        }

        boolean isMinus = false;
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            isMinus = s.charAt(i) == '-';
            i++;
        }
        int result = 0;
        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int digit = s.charAt(i) - '0';

            // Check for overflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return isMinus ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return isMinus ? -result : result;
    }

    public static void main(String[] args) {
        // String s = "42";
        // String s = " -042";
        // String s = "1337c0d3";
        // String s = "0-1";
        // String s = "words and 987";
        String s = "-91283472332";
        System.out.println(myAtoi(s));
    }
}
