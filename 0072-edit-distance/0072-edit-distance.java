class Solution {
    public int minDistance(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        
        // int p[][] = new int[n+1][m+1]; 
        int p[] = new int[m+1];
        for(int i=1; i<=m; i++) p[i] = i;
        // for(int j=0; j<=m; j++) p[0][j] = j;
        
        for(int i=1; i<=n; i++){
            int c[] = new int[m+1];
            c[0] = i;
            for(int j=1; j<=m; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)) c[j] = p[j-1];
                else{
                    int ins =p[j], del =c[j-1];
                    int rep = p[j-1];
                    c[j] = 1 + Math.min(rep, Math.min(del, ins));
                }
            }        
            p = c;
        }
        return p[m];
    }
}