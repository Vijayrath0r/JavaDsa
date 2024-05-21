package leetcode;

//Add Strings
public class Question415 {
    private static String addStrings(String num1, String num2) {
        int num1len = num1.length() - 1, num2len = num2.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= Math.max(num1len, num2len); i++) {
            int char1 = i <= num1len ? num1.charAt(num1len - i) - '0' : 0;
            int char2 = i <= num2len ? num2.charAt(num2len - i) - '0' : 0;

            carry = char1 + char2 + carry;
            result.append(carry % 10);
            carry = carry / 10;
        }
        if (carry == 1) {
            result.append(1);
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        // String num1 = "11", num2 = "123";
        // String num1 = "456", num2 = "77";
        // String num1 = "0", num2 = "0";
        String num1 = "99", num2 = "99";
        System.out.println(addStrings(num1, num2));
    }
}
