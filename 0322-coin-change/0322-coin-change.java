class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount < 1) return 0;
        
        int L =coins.length, sum =0;
        int[] dp = new int[amount+1];

        Arrays.sort(coins);
        while(++sum <= amount){
            int min = -1;
            
            for(int coin: coins){
                if(sum < coin) break;
                if(dp[sum-coin] != -1){
                    int temp = dp[sum-coin]+1;
                    min = min < 0 ? temp : (temp < min ? temp : min);
                }
            }
            dp[sum] = min;
        }
        
        return dp[amount];
    }
}