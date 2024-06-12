package leetcode;
// N-Queens II

public class Question52 {
    private static int count = 0;

    public static boolean isSafe(char[][] board, int row, int col) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q' || board[row][i] == 'Q') {
                return false;
            }
        }

        // check for upper left
        for (int r = row, c = col; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // check for upper right
        for (int r = row, c = col; r < board.length && c >= 0; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void helper(char[][] board, int col) {
        if (board.length == col) {
            count++;
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                helper(board, col + 1);
                board[row][col] = 0;
            }
        }

    }

    private static int totalNQueens(int n) {
        count = 0;
        char[][] board = new char[n][n];
        helper(board, 0);
        return count;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(totalNQueens(n));
    }
}
