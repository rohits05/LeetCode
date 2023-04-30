class Solution {
    public int longestPalindromeSubseq(String s) {
        int n =s.length();
        
        String t ="";
        for(int i=n-1; i>=0; i--) t += s.charAt(i);  // S2 = rev(S1)
        
        int p[] = new int[n+1];
        // for (int[] row: dp) Arrays.fill(row, 0);

        for(int i=1; i<=n; i++){ // LCS ~ S.O !
            int c[] = new int[n+1];
            for(int j=1; j<=n; j++){
                if(s.charAt(i-1) == t.charAt(j-1)) c[j] = 1 + p[j-1];
                else c[j] = Math.max(p[j], c[j-1]);
            }
            p = c;
        }

        return p[n];
    }
}