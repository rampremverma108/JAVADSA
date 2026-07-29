public class NQueens{
    public static void Queens(char board[][], int row){
        //base
        if(row == board.length){
            printBoard(board);
            return;
        }
        //col loop
          for(int j=0; j<board.length; j++){
        board[row][j] = 'Q';
         Queens(board, row+1);   // sahi
          board[row][j] = 'x';
}
    }

    public static void printBoard(char board[][]){
        System.out.println("-------chess board---------");
        for(int i=0; i<board.length; i++){
            for(int j =0; j<board.length; j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int n = 2;
        char board[][] = new char[n][n];
        //initialize
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = 'x';
            }
        }
        Queens(board, 0);
    }
}