class Solution {
    public int fib(int n) {
        // if (n <= 1) 
        //     return n;
        // return fib(n - 1) + fib(n - 2);
        
        // Memoization TechniQue!!
//         int dp[] = new int[n+1];
//         if(n <=1) return n; 
//         if(dp[n] != -1) return dp[n];
        
//         return dp[n] = fib(n-1) + fib(n-2);
        
        // Tabulation TechniQue!!
        if (n <= 1)  return n;
        int prev = 1, curr = 1;
        for(int i=2; i<=n; i++){
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}