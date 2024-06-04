package leetcode;

// Greatest Common Divisor of Strings
public class Question1071 {
    private static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    private static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        return str1.substring(0, findGCD(str1.length(), str2.length()));
    }

    public static void main(String[] args) {
        // String str1 = "ABCABC", str2 = "ABC";
        // String str1 = "ABABAB", str2 = "ABAB";
        String str1 = "LEET", str2 = "CODE";
        System.out.println(gcdOfStrings(str1, str2));
    }
}
