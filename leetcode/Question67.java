package leetcode;

//Add Binary
public class Question67 {
    private static String addBinary(String a, String b) {
        int alen = a.length() - 1;
        int blen = b.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < ((alen > blen) ? alen + 1 : blen + 1); i++) {
            int aval = 0 <= alen - i ? a.charAt(alen - i) - '0' : 0;
            int bval = 0 <= blen - i ? b.charAt(blen - i) - '0' : 0;
            carry = aval + bval + carry;
            result.append(carry % 2);
            carry = carry / 2;
        }
        if (carry == 1) {
            result.append('1');
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        // String a = "11", b = "1";
        String a = "1010", b = "1011";
        System.out.println(addBinary(a, b));
        // System.out.println(0 ^ 1 ^ 0);
    }
}
