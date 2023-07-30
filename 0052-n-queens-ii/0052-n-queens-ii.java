class Solution {
    public boolean isItSafe(boolean [][] board,int row,int col) {
        for(int i=row; i>=0; i--) if(board[i][col]) return false;
        
        for(int i=row, j=col; i>=0 & j>=0; i--, j--) if(board[i][j]) return false;
        for(int i=row,j=col; i>=0 & j<board[0].length; i--, j++) if(board[i][j]) return false;
        
        return true;
    }
    
    public int totalNQueens(int n) {
       boolean [][] board = new boolean[n][n]; 
       return NQueens(board, 0);
    }
    
    public int NQueens(boolean [][] board, int row) {
        int n = board.length, count = 0;
        if(row == n) return 1;

        for(int i=0; i<n; i++){
            if(isItSafe(board, row, i)){
                board[row][i] = true;
                count += NQueens(board, row+1);
                board[row][i] = false;
            }
        }
        
        return count;
    }
}