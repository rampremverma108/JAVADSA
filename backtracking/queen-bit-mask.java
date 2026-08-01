import java.util.*;

public class NQueensBitmask {

    public static List<List<Integer>> solveNQueens(int n, int m) {
        List<List<Integer>> solutions = new ArrayList<>();
        int[] board = new int[n];
        
        // If N > M, it's equivalent to solving M x N and transposing
        if (n > m) {
            return solveNQueensTransposed(m, n);
        }

        backtrack(0, n, m, 0, 0, 0, board, solutions);
        return solutions;
    }

    private static void backtrack(int row, int n, int m, int cols, int diag1, int diag2, 
                                  int[] board, List<List<Integer>> solutions) {
        if (row == n) {
            List<Integer> solution = new ArrayList<>();
            for (int r = 0; r < n; r++) {
                solution.add(board[r]);
            }
            solutions.add(solution);
            return;
        }

        // Bitmask of available positions in current row (1 = free, 0 = blocked)
        int available = ~(cols | diag1 | diag2) & ((1 << m) - 1);

        while (available != 0) {
            // Pick the rightmost available bit
            int bit = available & -available;
            available -= bit;

            // Get column index from bit position
            int col = Integer.numberOfTrailingZeros(bit);
            board[row] = col;

            // Recurse to next row:
            // diag1 shifts left, diag2 shifts right
            backtrack(row + 1, n, m, cols | bit, (diag1 | bit) << 1, (diag2 | bit) >> 1, board, solutions);
        }
    }

    // Helper method to handle N > M by swapping dimensions
    private static List<List<Integer>> solveNQueensTransposed(int n, int m) {
        List<List<Integer>> rawSolutions = solveNQueens(n, m);
        List<List<Integer>> transposed = new ArrayList<>();

        for (List<Integer> sol : rawSolutions) {
            int[] transBoard = new int[m];
            Arrays.fill(transBoard, -1);
            for (int r = 0; r < sol.size(); r++) {
                transBoard[sol.get(r)] = r;
            }
            List<Integer> list = new ArrayList<>();
            for (int val : transBoard) list.add(val);
            transposed.add(list);
        }
        return transposed;
    }

    public static void main(String[] args) {
        int N = 4, M = 5;
        List<List<Integer>> solutions = solveNQueens(N, M);
        
        System.out.println("Total solutions for " + N + "x" + M + ": " + solutions.size());
        for (List<Integer> sol : solutions) {
            System.out.println(sol); // Each entry represents board[row] = col
        }
    }
}