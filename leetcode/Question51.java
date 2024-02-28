package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Question51 {
    public static List<List<String>> allBoards = new ArrayList<List<String>>();

    public static void saveBoard(char[][] board) {
        List<String> newBoard = new ArrayList<String>();
        for (int row = 0; row < board.length; row++) {
            String column = "";
            for (int col = 0; col < board.length; col++) {
                column += board[row][col] == 0 ? '.' : board[row][col];
            }
            newBoard.add(column);
        }
        allBoards.add(newBoard);
    }

    public static boolean isSafe(char[][] board, int row, int col) {

        // check for verically and horizontally
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
            saveBoard(board);
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

    public static List<List<String>> solveNQueens(int n) {
        allBoards.clear();
        char[][] board = new char[n][n];
        helper(board, 0);
        return allBoards;
    }

    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }
}
