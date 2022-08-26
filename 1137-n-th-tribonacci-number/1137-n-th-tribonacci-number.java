class Solution {
    public int tribonacci(int n) {
        if(n <= 1) return n;
        
        // int prev2 =0, prev = 1,curr =1;
        // for(int i=3; i<=n; i++){
        //     int next = prev + curr + prev2;
        //     prev2 = prev;
        //     prev = curr;
        //     curr = next;
        // }
        // return prev;
    
        // Tabulation TechniQue!!    
        int dp[] = new int[38];
        dp[0]=0; 
        dp[1]=1;
        dp[2]=1;
       
        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        return dp[n];
    }
}