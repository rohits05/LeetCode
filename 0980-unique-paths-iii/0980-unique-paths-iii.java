class Solution {
    public int uniquePathsIII(int[][] grid) {
        int startI = 0, startJ = 0, count = 0;
        
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j] == 1){
                    startI = i;
                    startJ = j;
                }else if(grid[i][j] == 0) count++;
            }
        }
        
        return howManyPath(grid,startI,startJ,count + 1);
    }
    
    private int howManyPath(int[][] grid, int i, int j, int count){
        if(i >= grid.length || i < 0 || j >= grid[i].length 
            || j < 0 || grid[i][j] == -1) return 0;

        if(grid[i][j] == 2){
            if(count == 0) return 1;
            return 0;
        }

        int temp = grid[i][j];
        grid[i][j] = -1;
        int result = howManyPath(grid,i + 1,j,count - 1) +
                     howManyPath(grid,i - 1,j,count - 1) +
                     howManyPath(grid,i,j + 1,count - 1) +
                     howManyPath(grid,i,j - 1,count - 1);
        grid[i][j] = temp;
        
        return result;
    }
}