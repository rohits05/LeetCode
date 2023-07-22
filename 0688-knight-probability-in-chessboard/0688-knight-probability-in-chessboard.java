class Solution {
    int[][] dir = {{-2,1},{-1,2},{1,2},{2,1},{2,-1},{1,-2},{-1,-2},{-2,-1}};
    public double knightProbability(int n, int k, int row, int column) {
        double[][] curr = new double[n][n];
        double[][] next = new double[n][n];
        curr[row][column] = 1;
        
        for(int m=1; m<=k; m++){
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if(curr[i][j]!=0){
                        for(int[] d: dir){
                            int ni = i + d[0], nj = j + d[1];
                            if(isValid(ni,nj,n)) next[ni][nj] += curr[i][j]/8.0;
                        }
                    }
                }
            }
            curr = next;
            next = new double[n][n];
        }

        double sum = 0.0; 
        for(int i = 0; i<n ;i++)
            for(int j = 0; j<n; j++) sum += curr[i][j];
    
        return sum;
    }
    
    public boolean isValid(int i, int j, int n){
        if(i>=0 && j>=0 && i<n && j<n) return true;
        return false;
    }
}