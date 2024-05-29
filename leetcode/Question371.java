package leetcode;

// Sum of Two Integers
public class Question371 {
    private static int getSum(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

    public static void main(String[] args) {
        // int a = 1, b = 2;
        // int a = 2, b = 3;
        int a = -2, b = 3;
        System.out.println(getSum(a, b));
    }
}
