class Solution {
    public int numDecodings(String s) {
        int len =s.length();
        int [] dp = new int[len + 1];
        dp[len] =1;
        
        for(int k=len-1; k>=0; k--){
            if(s.charAt(k) == '0') continue;
            
            int res = dp[k + 1];
            if(k < len - 1 && (s.charAt(k) == '1' || s.charAt(k) == '2' && s.charAt(k+1) < '7')) 
            { res += dp[k + 2]; }
            
            dp[k] = res;
        }
        
        return dp[0];
    }
}