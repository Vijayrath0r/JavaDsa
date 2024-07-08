package leetcode;

// Find the Winner of the Circular Game
import java.util.ArrayList;

public class Question1823 {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int idx = 0;
        while (list.size() > 1) {
            idx = (idx + k - 1) % list.size();
            list.remove(idx);
        }

        return list.get(0);
    }

    public static void main(String[] args) {
        Question1823 solution = new Question1823();
        int n = 5, k = 2;
        // int n = 6, k = 5;

        System.out.println(solution.findTheWinner(n, k));
    }
}
