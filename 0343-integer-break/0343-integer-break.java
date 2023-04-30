class Solution {
    public int integerBreak(int n) {
        return integerBreakHelper(n, 1, 0, new Integer[n+1]);
    }
    
    private int integerBreakHelper(int n, int curr, int parts, Integer[] memo) {
        if(n == 0 && parts >= 2) return 1;
        if(n < 0 || curr > n) return 0;
            
        if(memo[n] != null) return memo[n];
        
        int with = curr * integerBreakHelper(n-curr, curr, parts+1, memo);
        int without = integerBreakHelper(n, curr+1, parts, memo); 
        
        return memo[n] = Math.max(with, without);
    }

}