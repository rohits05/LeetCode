class Solution {
    public int longestStrChain(String[] words) {
        int n =words.length;
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        int [] dp = new int[n];
        dp[0] = 1;
        int ans =1;

        for(int i=1; i<n; i++){
            int max = 0;
            
            for(int j=0; j<i; j++){
                String word1 = words[i];
                String word2 = words[j];
                if(word1.length() - word2.length() == 1){
                    if((lcs(word1, word2) == word2.length()) && dp[j] > max)
                        max = dp[j];
                }
            }
            dp[i] = max + 1;
            ans = Math.max(dp[i], ans);
        }
        
        return ans;
    }
    
    int lcs(String s,String t){
        int n =s.length(), m =t.length();
        
        int [][] dp = new int[n+1][m+1];
        for(int i=n-1; i>=0; i--){
            for(int j=m-1; j>=0; j--){
                char l = s.charAt(i), r = t.charAt(j);
                if(l == r) dp[i][j] = dp[i+1][j+1] + 1; 
                else dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
            }
        }
        
        return dp[0][0];
    }
}