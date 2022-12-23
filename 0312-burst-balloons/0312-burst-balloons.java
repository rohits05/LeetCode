class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n+2];
        arr[0] = arr[n+1] = 1; 
        
        for(int i=1; i<=n; i++) arr[i] = nums[i-1]; 
        
        int dp[][] = new int[n+2][n+2];
        for(int window=1; window<=n; window++){
            for(int left=1; left<=n-window+1; left++){
			
                int right = left+window-1;
                for(int i=left; i<=right; i++){
                    dp[left][right] = Math.max(dp[left][right], 
                    (arr[left-1] * arr[i] * arr[right+1]) + dp[left][i-1] + dp[i+1][right]);
                }
            }
        }
        return dp[1][n];
    }
}