class Solution {
    public int minDistance(String word1, String word2) {
        // del = n - lcs & ins = m - lcs i.e total_op = n + m - 2 * lcs!
        return (word1.length() + word2.length() - 2 * lcs(word1, word2)); // 
    }
    
    public int lcs(String s1, String s2){
        int x =s1.length(), y = s2.length();
        int[] dp = new int[y+1];
        
        for(int i=1; i<=x; i++){
            int[] curr = new int[y+1];
            for(int j=1; j<=y; j++){
                
                   if(s1.charAt(i-1) == s2.charAt(j-1)) curr[j] = 1 + dp[j-1];
                   else curr[j] = Math.max(dp[j],curr[j-1]);
                }
            dp = curr;
        }
        return dp[y];
    }
}