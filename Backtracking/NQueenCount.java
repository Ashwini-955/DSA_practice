public class NQueenCount{
    static int count=0;
    public static void queeen(char board[][],int row){
        if(row==board.length){
            count++;
            return;
        }
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col]='Q';//place the queen
                queeen(board,row+1);//backtrack the funtion
                board[row][col]='x';// remove the queen for next possible permutation
            }
        }
    }
    //check the safe function 
    public static boolean isSafe(char[][] board,int row,int col){
        //check vetically up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q')
                return false;
        }
        //check left diagonal
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //check right diagonal
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int n=4;
        char board[][]=new char[n][n];// create a board
        //insert x in all the places at board
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='x';
            }
        }
        queeen(board,0);
        System.out.println(count);
    }
}