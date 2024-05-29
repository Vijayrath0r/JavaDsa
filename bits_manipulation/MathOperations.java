package bits_manipulation;

public class MathOperations {
    public static int add(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

    public static int subtract(int a, int b) {
        b = add(~b, 1);
        return add(a, b);
    }

    public static int multiply(int a, int b) {
        int result = 0;
        while (b != 0) {
            if ((b & 1) != 0) {
                result = add(result, a);
            }
            a <<= 1;
            b >>= 1;
        }
        return result;
    }

    public static int divide(int dividend, int divisor) {
        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int quotient = 0;
        while (dividend >= divisor) {
            int temp = divisor;
            int multiple = 1;
            while (dividend >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            dividend = subtract(dividend, temp);
            quotient = add(quotient, multiple);
        }
        return sign * quotient;
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 7;
        System.out.println("---------------------");
        System.out.println("Addition: " + add(a, b)); // Addition: 22
        // System.out.println("Subtraction: " + subtract(a, b)); // Subtraction: 8
        // System.out.println("Multiplication: " + multiply(a, b)); // Multiplication:
        // 105
        // System.out.println("Division: " + divide(a, b)); // Division: 2
        System.out.println("---------------------");
    }
}
