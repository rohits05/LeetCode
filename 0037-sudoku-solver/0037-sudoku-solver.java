class Solution {
    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }

    private boolean solve(char[][] board, int row, int col) {
        int n =board.length, m=board[0].length;
        if(row == n) return true;
        if(col == m) return solve(board, row + 1, 0);
        if(board[row][col] != '.') return solve(board, row, col + 1);
        
        for(char num='1'; num<='9'; num++){
            if(isValidPlacement(board, row, col, num)){
                board[row][col] = num;
                if(solve(board, row, col + 1)) return true;
                board[row][col] = '.';
            }
        }
        
        return false;
    }

    private boolean isValidPlacement(char[][] board, int row, int col, char num) {
        int n =board.length;
        for(int i=0; i<n; i++){
            if(board[i][col] == num) return false;
            if(board[row][i] == num) return false;
 
            int subgridRow = 3 * (row / 3) + i / 3;
            int subgridCol = 3 * (col / 3) + i % 3;
 
            if(board[subgridRow][subgridCol] == num) return false;
        }

        return true;
    }
}