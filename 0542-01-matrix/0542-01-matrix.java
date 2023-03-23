class Solution {
    public int[][] updateMatrix(int[][] mat) {
//         DP!!
//         int m = mat.length, n = mat[0].length;
        
//         int maxI = 1000000;
//         for(int i=0; i<m; i++){
//             for(int j=0; j<n; j++){
//                 if(mat[i][j] != 0){
//                     int top = i-1 >= 0 ? mat[i-1][j] : maxI;
//                     int left = j - 1 >= 0 ? mat[i][j - 1] : maxI;
//                     mat[i][j] = Math.min(top, left) + 1;
//                 }
//             }
//         }
        
//         for(int i=m-1; i>=0; i--){
//             for(int j=n-1; j>=0; j--){
//                 if(mat[i][j] != 0){
//                     int bottom = i+1 < m ? mat[i+1][j] : maxI;
//                     int right = j+1 < n ? mat[i][j+1] : maxI;
//                     mat[i][j] = Math.min(mat[i][j], Math.min(bottom, right) + 1);
//                 }
//             }
//         }
        
//         return mat;
        
        //  ~BFS!
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        int r = mat.length, c = mat[0].length;
        int[][] visited = new int[r][c];
        
        Queue<int[]> q = new LinkedList<>();
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(mat[i][j] == 0){
                    q.add(new int[]{i,j});
                    visited[i][j] = 1;
                }
            }
        }
        
        int step = 1;
        while(!q.isEmpty()){
            int size = q.size();
            for(int k = 0; k < size; k++){
                int[] temp = q.poll();
                for(int[] dir : dirs){
                    int x = temp[0] + dir[0];
                    int y = temp[1] + dir[1];
                    if(x >= 0 && x < r && y >= 0 && y < c && visited[x][y] == 0){
                        visited[x][y] = 1;
                        mat[x][y] = step;
                        q.add(new int[]{x,y});
                    }
                }         
            }
            step++;
        }
        
        return mat;
    }
}