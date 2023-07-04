class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++) board[i][j] = '.';
        
        helper(0, board, new int[n], new int[2*n - 1], new int[2*n - 1], ans, n);
        return ans;
    }

    private void helper(int col, char[][] board, int[] left, int[] lowerDiagonal, int[] upperDiagonal, List<List<String>> ans, int n) {
        int len =board.length;
        if(col == n){
            List<String> list = new ArrayList<>();
            for(int i=0; i<len; i++) list.add(String.valueOf(board[i]));
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int row=0; row<n; row++){
            if(left[row] == 0 && lowerDiagonal[row + col] == 0 
                    && upperDiagonal[n - 1 + (row - col)] == 0){
                board[row][col] = 'Q';
                left[row] = 1;
                lowerDiagonal[row + col] = 1;
                upperDiagonal[n-1 + (row - col)] = 1;
                helper(col + 1, board, left, lowerDiagonal, upperDiagonal, ans, n);
                board[row][col] = '.';
                left[row] = 0;
                lowerDiagonal[row + col] = 0;
                upperDiagonal[n-1 + (row - col)] = 0;
            }
        }
    }
}