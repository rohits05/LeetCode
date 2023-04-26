class Solution {
    public int minDistance(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        
        int p[][] = new int[n+1][m+1]; 
        // int c[] = new int[n+1];
        for(int i=0; i<=n; i++) p[i][0] = i;
        for(int j=0; j<=m; j++) p[0][j] = j;
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)) p[i][j] = p[i-1][j-1];
                else p[i][j] = 1 + Math.min(p[i-1][j], Math.min(p[i][j-1], p[i-1][j-1]));
            }        
            // p = c;
        }
        return p[n][m];
    }
}