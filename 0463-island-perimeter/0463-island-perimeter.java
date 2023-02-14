class Solution {
    private int solve(int row,int col,int[][] grid){
        if(row<0 ||  row>=grid.length || col<0 || 
            col>=grid[0].length || grid[row][col]==0) return 1;
                                                      
        if(grid[row][col] == -1) return 0;
        grid[row][col] = -1;
        int up = solve(row-1, col, grid), right = solve(row, col+1, grid);
        int down = solve(row+1, col, grid), left = solve(row, col-1, grid);
        return up + right + down + left;
    }
        
    public int islandPerimeter(int[][] grid) {
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 1) return solve(i, j, grid);
            }
        }
        
        return 0;
    }
}