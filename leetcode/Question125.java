package leetcode;

//Valid Palindrome
public class Question125 {
    private static boolean isPalindrome(String s) {
        int start = 0, end = s.length() - 1;

        while (start < end) {
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }

            if (start < end && Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println('@' - '0');
        // String s = "A man, a plan, a canal: Panama";
        // String s = "race a car";
        // String s = " ";
        // String s = "A man, a plan, a canal: Panama";
        // String s = "0P";
        String s = "0P";
        System.out.println(isPalindrome(s));
    }
}
