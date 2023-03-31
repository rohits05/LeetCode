class Solution {
    public int dfs(int row, int col, int k) {
        if(dp[row][col][k] != 0) return dp[row][col][k];
        if(k == 0) return 1;

        int res = 0;
        for(int i=row; i<pizza.length; i++){ 
            if(count[row][col] > count[i][col] && count[i][col] >= k){
                res += dfs(i, col, k - 1);
                res %= 1000000007;        
            }
        }
        
        for(int i=col; i<pizza[0].length(); i++) {
            if(count[row][col] > count[row][i] && count[row][i] >= k){
                res += dfs(row, i, k - 1); 
                res %= 1000000007;               
            }
        }
        
        dp[row][col][k] = res;
        return res;
    }
    
    private String[] pizza;
    private int[][][] dp;
    private int[][] count;
    public int ways(String[] pizza, int k) {
        this.pizza = pizza;
        this.dp = new int[pizza.length + 1][pizza[0].length() + 1][k + 1];
        this.count = new int[pizza.length + 1][pizza[0].length() + 1];
        int m = pizza.length, n = pizza[0].length();
        count[m - 1][n - 1] = pizza[m - 1].charAt(n - 1) == 'A' ? 1 : 0;
        for(int i=m-2; i>=0; i--){
            int z = pizza[i].charAt(n - 1) == 'A' ? 1 : 0;
            count[i][n - 1] = count[i + 1][n - 1] + z;
        } 
        
        for(int j=n-2; j>=0; j--){
            int z = pizza[m - 1].charAt(j) == 'A' ? 1 : 0;
            count[m - 1][j] = count[m - 1][j + 1] + z;
        }
        
        for(int i=m-2; i>=0; i--){
            for(int j=n-2; j>=0; j--){
                int z = pizza[i].charAt(j) == 'A' ? 1 : 0;
                count[i][j] = count[i + 1][j] + count[i][j + 1] - count[i + 1][j + 1] + z;
            }
        }

        return dfs(0, 0, k - 1);
    }
}