package leetcode;

// The kth Factor of n
public class Question1492 {
    public int kthFactor(int n, int k) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (count == k) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Question1492 solution = new Question1492();
        // int n = 12, k = 3;
        int n = 7, k = 2;

        System.out.println(solution.kthFactor(n, k));
    }
}
