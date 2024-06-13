package leetcode;

// Word Search
public class Question79 {
    private static boolean helper(char[][] board, String word, int wordIdx, int i, int j, boolean[][] visited, int m,
            int n) {
        if (wordIdx == word.length()) {
            return true;
        }
        char currentChar = word.charAt(wordIdx);
        if (i + 1 < m && board[i + 1][j] == currentChar && !visited[i + 1][j]) {
            visited[i + 1][j] = true;
            if (helper(board, word, wordIdx + 1, i + 1, j, visited, m, n)) {
                return true;
            }
            visited[i + 1][j] = false;
        }

        if (j + 1 < n && board[i][j + 1] == currentChar && !visited[i][j + 1]) {
            visited[i][j + 1] = true;
            if (helper(board, word, wordIdx + 1, i, j + 1, visited, m, n)) {
                return true;
            }
            visited[i][j + 1] = false;
        }

        if (i - 1 >= 0 && board[i - 1][j] == currentChar && !visited[i - 1][j]) {
            visited[i - 1][j] = true;
            if (helper(board, word, wordIdx + 1, i - 1, j, visited, m, n)) {
                return true;
            }
            visited[i - 1][j] = false;
        }

        if (j - 1 >= 0 && board[i][j - 1] == currentChar && !visited[i][j - 1]) {
            visited[i][j - 1] = true;
            if (helper(board, word, wordIdx + 1, i, j - 1, visited, m, n)) {
                return true;
            }
            visited[i][j - 1] = false;
        }

        return false;
    }

    private static boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    visited[i][j] = true;
                    if (helper(board, word, 1, i, j, visited, m, n))
                        return true;

                    visited[i][j] = false;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A','D',
        // 'E', 'E' } };
        // String word = "ABCCED";
        // String word = "SEE";
        // String word = "ABCB";

        char[][] board = { { 'a', 'b' } };
        String word = "ba";
        System.out.println(exist(board, word));
    }
}
