package Recursion;

public class Factorial {
    public static int calFatorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact_nm1 = calFatorial(n - 1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }

    public static void main(String[] args) {
        int n = 6;
        int ans = calFatorial(n);
        System.out.println(ans);
    }
}
