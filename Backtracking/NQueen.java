//prints all the possible permutaions of queens 
public class NQueen{
    public static void queeen(char board[][],int row){
        if(row==board.length){
            printBoard(board);
            return;
        }
        for(int col=0;col<board.length;col++){
            board[row][col]='Q';
            queeen(board,row+1);
            board[row][col]='x';
        }
    }
    public static void printBoard(char[][] board){
        System.out.println("---------------chess board-----------------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n=2;
        char board[][]=new char[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='x';
            }
        }
        queeen(board,0);

    }
}