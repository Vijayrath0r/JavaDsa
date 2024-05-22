package leetcode;

// Valid Sudoku
public class Question36 {
    private static boolean isValid(char[][] board, int row, int col) {
        char currentChar = board[row][col];
        for (int i = 0; i < 9; i++) {
            if ((board[row][i] == currentChar && i != col) || (board[i][col] == currentChar && i != row)) {
                return false;
            }
        }
        int rowRange = (row / 3) * 3;
        int colRange = (col / 3) * 3;
        for (int i = rowRange; i < rowRange + 3; i++) {
            for (int j = colRange; j < colRange + 3; j++) {
                if (board[i][j] == currentChar && i != row && j != col) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && !isValid(board, i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board1 = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' } }; // true

        char[][] board2 = {
                { '8', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' } }; // false
        System.out.println(isValidSudoku(board1));
        System.out.println(isValidSudoku(board2));
    }
}
