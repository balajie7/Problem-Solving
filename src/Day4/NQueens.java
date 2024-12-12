package Day4;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        int[] board = new int[n];
        solveNQueensHelper(solutions, board, 0, n);
        return solutions;
    }

    private static void solveNQueensHelper(List<List<String>> solutions, int[] board, int row, int n) {
        if (row == n) {
            solutions.add(generateBoard(board, n));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row] = col;
                solveNQueensHelper(solutions, board, row + 1, n);
                board[row] = -1;
            }
        }
    }

    private static boolean isSafe(int[] board, int row, int col, int n) {
        for (int i = 0; i < row; i++) {
            if (board[i] == col || Math.abs(board[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }

    private static List<String> generateBoard(int[] board, int n) {
        List<String> solution = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            char[] row = new char[n];
            for (int j = 0; j < n; j++) {
                row[j] = (board[i] == j) ? 'Q' : '.';
            }
            solution.add(new String(row));
        }
        return solution;
    }

    public static void main(String[] args) {
        int n = 4;
        List<List<String>> solutions = solveNQueens(n);
        System.out.println("All solutions for N-Queens (" + n + " queens):");
        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
