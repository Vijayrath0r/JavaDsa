package leetcode;

public class Question50 {
    public static double myPow(double x, int n) {
        double result = 1.0000;
        if (n == 0 || x == 1) {
            return 1.0000;
        } else if (n == 1) {
            return x;
        } else if (n > 1) {
            for (int i = 0; i < n; i++) {
                result *= x;
            }
        } else {
            for (int i = n; i < 0; i++) {
                result *= x;
            }
            result = 1.0000/result;
        }
        return result;
    }

    public static void main(String[] args) {
        // double x = 2.00000;
        // int n = 10;

        // double x = 2.00000;
        // int n = -2;

        double x = 2.00000;
        int n = -2147483648;

        System.out.println(myPow(x, n));
    }
}
