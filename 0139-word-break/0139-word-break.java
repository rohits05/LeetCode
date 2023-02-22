class Solution {
    private boolean isNullOrEmpty(String s) {
        return (s == null || s.length() == 0);
    }
    
    public boolean wordBreak(String s, List<String> wordDict) {
        if (isNullOrEmpty(s) || wordDict == null) return false;
        
        final int cols = s.length() + 1;
        int[] dp = new int[cols];
        dp[cols-1] = 0;
        
        for(int j=cols-2; j>=0; j--){
            int nCharsAvail = s.length() - j;
            dp[j] = 0;
            
            for(String word: wordDict){
                if(nCharsAvail >= word.length()){
                    int suffixScore = dp[j + word.length()];
                    int scorePotential = word.length() + suffixScore;
                    if(scorePotential == nCharsAvail){
                        if(isMatchStartingAt(s, j, word)){
                            dp[j] =  scorePotential;
                            break;
                        }
                    }
                }
            }
        }

        return (dp[0] == s.length());
    }
    
    private boolean isMatchStartingAt(String s, int sStartIndex, String word) {
        for(int i=0; i<word.length(); i++)
            if(s.charAt(sStartIndex + i) != word.charAt(i)) return false;

        return true;
    }
}