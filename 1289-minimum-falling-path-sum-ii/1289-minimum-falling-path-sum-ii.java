class Solution {
    public int minFallingPathSum(int[][] mat) {
        // code here | Space . OpTimizeD !
        int n = mat.length, m =mat[0].length;
        int prev[] = new int[n];
        
        for(int i=0; i<m; i++) prev[i] = mat[0][i];
        
        for(int i=1; i<n; i++){
            int cur[] = new int[n];
            
            for(int j=0; j<m; j++){
                int minI = Integer.MAX_VALUE;
                for(int k=0; k<m; k++){
                    if(k != j) minI = Math.min(minI, mat[i][j] + prev[k]);
                }
                cur[j] = minI;
            }
            prev = cur;
        }
        
        int res = Integer.MAX_VALUE;
        for(int j=0; j<m; j++) res = Math.min(res, prev[j]);
        return res;
    }
}