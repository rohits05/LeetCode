class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int width = obstacleGrid[0].length;
        
        int[] path = new int[width];
        path[0] = 1;
        for(int[] row: obstacleGrid){
            for(int j=0; j<width; j++){
                if(row[j] == 1) path[j] = 0;
                else if(j > 0) path[j] += path[j - 1];
            }
        }
        
        return path[width - 1];
   }
}