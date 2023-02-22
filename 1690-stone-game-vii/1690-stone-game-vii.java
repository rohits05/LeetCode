class Solution {
    public int stoneGameVII(int[] stones) {
        int sum =0;
        Integer [][]dp = new Integer[stones.length][stones.length];
        
        for(int i=0; i<stones.length; i++) sum += stones[i];
        int ans = fn(0, stones.length-1, stones, 1, sum, dp);
        return ans;
    }
    public int fn(int l,int h,int []stones,int st,int sum,Integer [][]dp){
        if(l == h) return 0;
        if(dp[l][h] != null) return dp[l][h];
        
        if(st == 1){
              int ans1 = sum-stones[l] + fn(l+1, h, stones, 0, sum-stones[l], dp);
              int ans2 = sum-stones[h] + fn(l, h-1, stones, 0, sum-stones[h], dp);
              dp[l][h] = Math.max(ans1, ans2);
        }else{
             int ans3 =- (sum-stones[l]) + fn(l+1, h, stones, 1, sum-stones[l], dp);
             int ans4 =- (sum-stones[h]) + fn(l, h-1, stones, 1, sum-stones[h], dp);
            dp[l][h] = Math.min(ans3, ans4);
        }
        
        return dp[l][h];
    }
}