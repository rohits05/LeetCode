class Solution {
    public void solve(char[][] board) {
        int row = board.length, col = board[0].length;
        if(row <= 2 || col <= 2) return;

        for(int i=0; i<row; i++) {
            if(board[i][0] == 'O') dfs(board, i, 0);    
            if(board[i][col - 1] == 'O') dfs(board, i, col - 1);    
        }
      
        for(int j=0; j<col; j++){
            if(board[0][j] == 'O') dfs(board, 0, j);
            if(board[row -1][j] == 'O') dfs(board, row - 1, j);    
        }
      
        for(int i=1; i<row; i++){
            for(int j=1; j<col; j++){
                if(board[i][j] == 'O') board[i][j] = 'X';
            }
        }
      
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(board[i][j] == '#') board[i][j] = 'O';
            }
        }
  }

  public void dfs(char[][] board, int i, int j) {
	if (board[i][j] == 'O'){
		board[i][j] = '#';
		if(i > 1 && board[i - 1][j] == 'O') dfs(board, i - 1, j);
		if(i + 1 < board.length  && board[i + 1][j] == 'O') dfs(board, i + 1, j);
		if(j > 1 && board[i][j - 1] == 'O') dfs(board, i, j - 1);
		if(j + 1 < board[0].length && board[i][j + 1] == 'O') dfs(board, i, j + 1);
	}
  }
}