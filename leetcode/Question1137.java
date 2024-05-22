package leetcode;

// N-th Tribonacci Number
public class Question1137 {
    private static int tribonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        int t0 = 0, t1 = 1, t2 = 1, result = 0;
        for (int i = 3; i <= n; i++) {
            result = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = result;
        }
        return result;
    }

    public static void main(String[] args) {
        // int n = 4;
        int n = 25;
        System.out.println(tribonacci(n));
    }
}
