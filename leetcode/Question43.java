package leetcode;

// Multiply Strings

public class Question43 {
    private static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int n1len = num1.length();
        int n2len = num2.length();
        int[] result = new int[n1len + n2len];

        for (int i = n1len - 1; i >= 0; i--) {
            int carry = 0;
            for (int j = n2len - 1; j >= 0; j--) {
                int n1val = num1.charAt(i) - '0';
                int n2val = num2.charAt(j) - '0';
                int sum = n1val * n2val + result[i + j + 1] + carry;
                carry = sum / 10;
                result[i + j + 1] = sum % 10;
            }
            result[i] += carry;
        }

        StringBuilder sb = new StringBuilder();
        for (int r : result) {
            if (!(sb.length() == 0 && r == 0)) { // skip leading zeros
                sb.append(r);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        // String num1 = "2", num2 = "3";
        // String num1 = "23", num2 = "89";
        // String num1 = "123", num2 = "456";
        // String num1 = "123456789", num2 = "987654321"; // 121932631112635269
        String num1 = "498828660196", num2 = "840477629533"; // 419254329864656431168468
        System.out.println(multiply(num1, num2));
    }
}
