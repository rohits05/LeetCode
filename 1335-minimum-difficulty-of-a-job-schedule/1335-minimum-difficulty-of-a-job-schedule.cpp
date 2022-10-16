class Solution {
public:
    int dp[305][15];
    
    int helper(vector<int>& arr, int i, int n, int k) {
        if(i == n && k == 0) return 0;
        if(k <= 0) return INT_MAX;
        if(dp[i][k] != -1) return dp[i][k];
        
        int maxi = 0, mini = INT_MAX;
        for(int j=i; j<n; j++){
            maxi = max(maxi, arr[j]);
            int temp = helper(arr, j + 1, n, k - 1);
            if(temp != INT_MAX) mini = min(mini, maxi + temp);
        }
        return dp[i][k] = mini;
    }
    
    int minDifficulty(vector<int>& arr, int k) {
        int n = arr.size();
        memset(dp, -1, sizeof(dp));
        int mini = helper(arr, 0, n, k);
        if(mini == INT_MAX) return -1;
        return mini;
    }
};