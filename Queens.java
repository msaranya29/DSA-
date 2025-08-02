public class Queens{
    public static boolean isSafe(char board[][], int row, int col) {
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //diagonal up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //diagonal up right
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }


public static void nQueens(char board[][], int row) {
    if(row==board.length){
        
        printBoard(board);
        return;
    }




    for(int j=0;j<board.length;j++){
        if(isSafe(board, row, j)){
             board[row][j]='Q';
            nQueens(board, row+1);
            board[row][j]='-';}
   
    }
}
public static void printBoard(char board[][]) {
    for (char[] board1 : board) {
        for (int j = 0; j<board.length; j++) {
            System.out.print(board1[j] + " ");
        }
        System.out.println();
    }
    System.out.println();
}
    
    
public static void main(String[] args) {
    int n=4;
    char board[][]=new char[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            board[i][j]='-';
        }
    }
    nQueens(board,0);
}

}