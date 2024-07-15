package leetcode;

// Number of Provinces
public class Question547 {
    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        int len = isConnected.length;
        boolean[] visisted = new boolean[len];
        for (int i = 0; i < len; i++) {
            if (!visisted[i]) {
                dfs(isConnected, visisted, i);
                count++;
            }
        }
        return count;
    }

    public void dfs(int[][] isConnected, boolean[] visisted, int i) {
        visisted[i] = true;
        for (int j = 0; j < visisted.length; j++) {
            if (isConnected[i][j] == 1 && !visisted[j]) {
                dfs(isConnected, visisted, j);
            }
        }
    }

    public static void main(String[] args) {
        Question547 solution = new Question547();
        // int[][] isConnected = { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } };
        // int[][] isConnected = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
        int[][] isConnected = { { 1, 0, 0, 1 }, { 0, 1, 1, 0 }, { 0, 1, 1, 1 }, { 1, 0, 1, 1 } };
        System.out.println(solution.findCircleNum(isConnected));
    }
}
