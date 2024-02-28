package BackTracking;

public class NQueens {
    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.print("-");
            for (int j = 0; j < board.length; j++) {
                System.out.print("---");
            }
            System.out.println();
            System.out.print("| ");
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 'Q') {
                    System.out.print(board[i][j] + "| ");
                } else {
                    System.out.print(board[i][j] + " | ");
                }
            }
            System.out.println();
        }
        System.out.print("-");
        for (int j = 0; j < board.length; j++) {
            System.out.print("---");
        }
        System.out.println();
        System.out.println();
    }

    public static boolean isSafe(char[][] board, int row, int col) {

        // check for verically
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // check for horizontally
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') {
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

        // check for lower left
        for (int r = row, c = col; r >= 0 && c < board.length; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // check for lower right
        for (int r = row, c = col; r < board.length && c < board.length; r++, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void helper(char[][] board, int col) {
        if (board.length == col) {
            printBoard(board);
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

    public static void solveNQueens(int n) {
        char[][] board = new char[n][n];
        helper(board, 0);
    }

    public static void main(String[] args) {
        int n = 4;
        solveNQueens(n);
    }
}
