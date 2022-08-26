class Solution {
    public int tribonacci(int n) {
        if(n < 3) return n == 0? 0:1;
        
        // Tabulation TechniQue!!    
        // Space Optimization
        int prev2 =0, prev = 1,curr =1;
        int next = 0;
        for(int i=3; i<=n; i++){
            next = prev2 + prev + curr;
            prev2 = prev;
            prev = curr;
            curr = next;
        }
        return next;
    
        
//         int dp[] = new int[38];
//         dp[0]=0; 
//         dp[1]=1;
//         dp[2]=1;
       
//         for(int i=3;i<=n;i++){
//             dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
//         }
//         return dp[n];
    }
}