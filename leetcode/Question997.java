package leetcode;

//  Find the Town Judge
public class Question997 {
    public int findJudge(int n, int[][] trust) {
        int[] inBound = new int[n + 1];
        int[] outBound = new int[n + 1];
        for (int[] relation : trust) {
            ++inBound[relation[1]];
            ++outBound[relation[0]];
        }
        for (int i = 1; i <= n; i++) {
            if (inBound[i] == n - 1 && outBound[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Question997 solution = new Question997();
        int n = 2;
        int[][] trust = { { 1, 2 } };

        System.out.println(solution.findJudge(n, trust));
    }
}
