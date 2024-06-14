package leetcode;

// Pow(x, n)
public class Question50 {
    private static double helper(double x, long n) {
        if (n == 0) {
            return 1;
        }
        double half = helper(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }

    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        } else if (x == 1.0) {
            return 1.0;
        } else if (n == 1) {
            return x;
        }

        boolean isNegative = n < 0;
        long absN = Math.abs((long) n);

        double result = helper(x, absN);
        if (isNegative) {
            return 1 / result;
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
