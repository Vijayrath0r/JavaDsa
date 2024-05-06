package leetcode;
//Reverse Integer
public class Question7 {
    private static int reverse(int x) {
        int remainder = 0, result = 0;
        boolean isMinus = false;
        if (x < 0) {
            isMinus = true;
            x = x * (-1);
        }
        while (x > 0) {
            remainder = x % 10;
            if ((result * 10L + remainder) > Integer.MAX_VALUE) {
                return 0;
            }
            result = result * 10 + remainder;
            x = (x - remainder) / 10;
        }
        if (isMinus) {
            return result * (-1);
        } else {
            return result;
        }
    }

    public static void main(String[] args) {
        // int x = 123;
        // int x = -123;
        // int x = 120;
        int x = 1534236469;
        System.out.println(reverse(x));
        System.out.println(964632435 * 10L);
    }
}
