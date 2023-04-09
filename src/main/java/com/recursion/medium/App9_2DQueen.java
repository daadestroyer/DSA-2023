package com.recursion.medium;

public class App9_2DQueen {
    static void queenCombination2d(boolean[][] boxes, int row, int col, int qp, int tq, String ans) {
        if (qp == tq) {
            System.out.println(ans);
            return;
        }
        if (col == boxes[0].length) {
            col = 0;
            row++;
        }
        if (row == boxes.length) {
            return;
        }

        boxes[row][col] = true;
        queenCombination2d(boxes, row, col + 1, qp + 1, tq, ans + "{" + row + ":" + col + "}");

        boxes[row][col] = false;
        queenCombination2d(boxes, row, col + 1, qp, tq, ans);
    }


    private static boolean isItSafe(boolean[][] board, int row, int col) {
        // case-1 vertically upward
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col]) {
                return false;
            }
        }
        // case-2 vertically left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }
        // case-3 vertically right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board[0].length; i--, j++) {
            if (board[i][j]) {
                return false;
            }
        }
        // case 4 horizontally left
        for (int j = col - 1; j >= 0; j--) {
            if (board[row][j]) {
                return false;
            }
        }
        return true;
    }

    static void queenCombination2dKill(boolean[][] board, int row, int col, int qp, int tq, String ans) {
        if (qp == tq) {
            System.out.println(ans);
            return;
        }
        if (col == board[0].length) {
            col = 0;
            row++;
        }
        if (row == board.length) {
            return;
        }
        if (isItSafe(board, row, col)) {
            board[row][col] = true;
            queenCombination2dKill(board, row, col + 1, qp + 1, tq, ans + "{" + row + ":" + col + "}");
            board[row][col] = false;
        }

        queenCombination2dKill(board, row, col + 1, qp, tq, ans);
    }

    public static void main(String[] args) {
        //queenCombination2d(new boolean[2][3], 0, 0, 0, 2, "");
        queenCombination2dKill(new boolean[4][4], 0, 0, 0, 4, "");
    }
}
