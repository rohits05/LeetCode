class Solution {
     public void solveSudoku(char[][] board) {
        if(board.length == 0) return;
        dfs(board);
    }
    
    private boolean isSafe(char[][] board,int i,int j,int c){
        for(int p=0; p<9; p++){
            if(board[p][j] == c) return false;
        }
        for(int p=0; p<9; p++){
            if(board[i][p] == c) return false;
        }

        int row = i-i%3, col = j-j%3;
        for(int p=row; p<row+3; p++){
            for(int q=col; q<col+3; q++){
                if(board[p][q] == c) return false;
        }}
        return true;
    }
    
    public boolean dfs(char[][] board){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] == '.'){
                    for(char k='1'; k<='9'; k++){
                        if(isSafe(board, i, j, k)){ board[i][j] = k;
                            if(dfs(board)) return true;
                            else board[i][j]='.';
                        }}
             return false;
         }}}
        return true;
    }
}