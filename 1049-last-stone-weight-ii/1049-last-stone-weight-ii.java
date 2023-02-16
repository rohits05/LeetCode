class Solution {
    public int lastStoneWeightII(int[] stones) {
        int n = stones.length, total = 0, maxSum = 0;
        
        for(int s: stones) total += s;
        boolean[] dp = new boolean[total/2+1];
        dp[0] = true;
        
        for(int s: stones){
            boolean[] temp = dp.clone();
            for(int sum=s; sum<=total/2; sum++){
                if(dp[sum-s]){
                    temp[sum] = true;
                    maxSum = Math.max(maxSum, sum);
                }
                    
                if(maxSum == total/2) return total - maxSum*2;
            }
            dp = temp;
        }
        
        return total - maxSum*2;
    }
}