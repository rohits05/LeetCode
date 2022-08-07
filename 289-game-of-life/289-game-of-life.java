class Solution {
    public static void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int temp[][] =new int[m][n];
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                
                int c=0;
                if(i-1 >= 0 && j-1 >= 0) // north-west
                    c=board[i-1][j-1] == 1 ? c+1 : c;
                
                if(i-1 >= 0) // north
                    c=board[i-1][j] == 1 ? c+1 : c;
                
                if(i-1 >= 0 && j+1 < n) // north-east
                    c=board[i-1][j+1] == 1 ? c+1 : c;
                
                if(j+1 < n) // east
                    c=board[i][j+1] == 1 ? c+1 : c;
                
                if(i+1 < m && j+1 < n) // south-east
                    c=board[i+1][j+1] == 1 ? c+1 : c;
                
                if(i+1 < m) // south
                    c=board[i+1][j] == 1 ? c+1 : c;
                
                if(i+1<m && j-1>=0) // south-west
                    c=board[i+1][j-1] == 1 ? c+1 : c;
                
                if(j-1>=0) // west
                    c=board[i][j-1] == 1 ? c+1 : c;
                
                // Updating value in temp[ ][ ] 
                if(board[i][j] == 1 && c < 2)
                    temp[i][j] = 0;
                
                else if(board[i][j] == 1 && c <= 3)
                    temp[i][j] = 1;
                
                else if(board[i][j] == 1 && c > 3)
                    temp[i][j] = 0;
                
                else if(board[i][j] == 0 && c == 3)
                    temp[i][j] = 1;   
            }
        }
        
        for(int i=0; i<board.length; i++){
          for(int j=0; j<board[0].length; j++)
            board[i][j] = temp[i][j];
        }
    }
}