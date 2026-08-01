public class SimpleSudokuSolver {

    public static boolean solveSudoku(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                
                // Find an empty cell
                if (board[row][col] == '.') {
                    
                    // Try placing numbers 1 through 9
                    for (char number = '1'; number <= '9'; number++) {
                        
                        // 1. CHECK: Is it valid to place this number here?
                        if (isValid(board, row, col, number)) {
                            board[row][col] = number; // Place the number

                            // 2. RECURSE: Try to solve the rest of the board
                            if (solveSudoku(board)) {
                                return true; // Found a valid solution!
                            }

                            // 3. BACKTRACK: Undo the move if it led to a dead end
                            board[row][col] = '.';
                        }
                    }

                    // If no number 1-9 fits here, this path failed
                    return false; 
                }
            }
        }
        return true; // No empty cells left, Sudoku is solved!
    }

    // Helper method to check if a number can be safely placed
    private static boolean isValid(char[][] board, int row, int col, char number) {
        for (int i = 0; i < 9; i++) {
            // Check row
            if (board[row][i] == number) return false;
            
            // Check column
            if (board[i][col] == number) return false;
            
            // Check 3x3 sub-grid
            int boxRow = 3 * (row / 3) + i / 3;
            int boxCol = 3 * (col / 3) + i % 3;
            if (board[boxRow][boxCol] == number) return false;
        }
        return true;
    }

    // Print the Sudoku board clearly
    public static void printBoard(char[][] board) {
        for (int r = 0; r < 9; r++) {
            if (r % 3 == 0 && r != 0) System.out.println("------+-------+------");
            for (int c = 0; c < 9; c++) {
                if (c % 3 == 0 && c != 0) System.out.print("| ");
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        if (solveSudoku(board)) {
            System.out.println("Solved Sudoku Board:\n");
            printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }
}
