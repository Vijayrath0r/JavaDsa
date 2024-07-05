package leetcode;

// Happy Number
public class Question202 {
    public boolean isHappy(int n) {
        while (n > 9) {
            int sum = 0;
            while (0 < n) {
                int digit = n % 10;
                sum += Math.pow(digit, 2);
                n = n / 10;
            }
            n = sum;
        }
        return (n == 1 || n == 7);
    }

    public static void main(String[] args) {
        Question202 solution = new Question202();
        int n = 19;

        System.out.println(solution.isHappy(n));
    }
}
