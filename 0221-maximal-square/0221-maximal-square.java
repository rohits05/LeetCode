class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix == null || matrix.length == 0) return 0;
        
        int dp[][] = new int[matrix.length+1][matrix[0].length+1];
        int max=0;
        
        for(int i=1; i<=matrix.length; i++){
            for(int j=1; j<=matrix[0].length; j++){
                if(matrix[i-1][j-1] == '1'){
                    dp[i][j] = 1 + min(dp[i-1][j], dp[i][j-1], dp[i-1][j-1]);
                    max = Math.max(dp[i][j], max);
                }
                else dp[i][j]=0;
            }
        }
        
        return (max * max);
    }
    
    public int min(int a, int b, int c){
        int r = Math.min(a, b);
        return Math.min(r, c);
    }
}