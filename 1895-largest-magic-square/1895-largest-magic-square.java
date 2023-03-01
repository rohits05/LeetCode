class Solution {
    public int largestMagicSquare(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int row[][] = new int[n][m]; 
        int column[][] = new int[n][m];
        
        for(int i=0; i<n; i++) row[i][0] = grid[i][0];
        for(int i=0; i<n; i++)
            for(int j=1; j<m; j++) row[i][j] = row[i][j-1] + grid[i][j];
        
        for(int j=0; j<m; j++) column[0][j] = grid[0][j];
        for(int j=0; j<m; j++)
            for(int i=1; i<n; i++)
                column[i][j] = column[i-1][j] + grid[i][j];
        
        int ans = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int maxPossible = Math.min(n-i , m-j);
                for(int k=maxPossible; k>1; k--){
                    if(possible(grid, row, column, i, j, k)){
                        ans = Math.max(ans , k);
                        break;
                    }
                }
            }
        }
        return ans;
    }
    
    public boolean possible(int grid[][] , int row[][] , int column[][] , int x , int y , int size){
        int n = grid.length, m = grid[0].length;
        boolean ok = true;
        int sum = row[x][y+size-1] - row[x][y] + grid[x][y];
        
        for(int i=0; i<size; i++){
            int now = row[x+i][y+size-1] - row[x+i][y] + grid[x+i][y];
            if(sum != now) return false;
        }
        
        for(int j=0; j<size; j++){
            int now = column[x+size-1][y+j] - column[x][y+j] + grid[x][y+j];
            if(sum != now) return false;
        }
        
        int diag1 = 0, diag2 = 0;
        for(int i=0; i<size; i++){
            diag1 += grid[x+i][y+i];
            diag2 += grid[x+i][y+size-1-i];
        }
        
        if(diag1 != sum || diag2 != sum) return false;
        return true;
    }
}