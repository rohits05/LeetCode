class Solution {
    public int minInsertions(String s1) {
        String s2 = "";
        int x =s1.length();
        for(int i=x-1; i>=0; i--) s2 += s1.charAt(i);
        
        int dp[] = new int[x+1];
        
        for(int i=1; i<=x; i++){ // L.P.S ~
            int cur[] = new int[x+1];
            for(int j=1; j<=x; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)) cur[j] = 1 + dp[j-1];
                else cur[j] = Math.max(dp[j], cur[j-1]);
            }
            dp = cur;
        }
        
        return (s1.length() - dp[x]); // a c p c a
    }
}