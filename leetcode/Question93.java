package leetcode;

// Restore IP Addresses
import java.util.ArrayList;
import java.util.List;

public class Question93 {
    private static boolean isValidSegment(String segment) {
        if (segment.length() > 1 && segment.startsWith("0")) {
            return false; // Avoid segments with leading zeros, except for "0"
        }
        int value = Integer.parseInt(segment);
        return value >= 0 && value <= 255;
    }

    private static void helper(String s, int idx, int dots, String current, List<String> result) {
        if (dots == 0) {
            if (isValidSegment(s.substring(idx))) {
                result.add(current + s.substring(idx));
            }
            return;
        }

        for (int i = idx + 1; i <= idx + 3 && i < s.length(); i++) {
            String segment = s.substring(idx, i);
            if (isValidSegment(segment)) {
                helper(s, i, dots - 1, current + segment + ".", result);
            }
        }
    }

    private static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12) {
            return result;
        }
        helper(s, 0, 3, "", result);
        return result;
    }

    public static void main(String[] args) {
        // String s = "25525511135";
        String s = "0000";
        // String s = "101023";
        System.out.println(restoreIpAddresses(s));
    }
}
