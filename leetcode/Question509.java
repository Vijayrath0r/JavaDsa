package leetcode;

//  Fibonacci Number
public class Question509 {
    public int fib(int n) {
        int first = 0, second = 1, third;
        if (n < 2) {
            return n;
        }
        for (int i = 2; i <= n; i++) {
            third = first + second;
            first = second;
            second = third;
        }
        return second;
    }

    public static void main(String[] args) {
        Question509 solution = new Question509();
        int n = 2;
        System.out.println(solution.fib(n));
    }
}
