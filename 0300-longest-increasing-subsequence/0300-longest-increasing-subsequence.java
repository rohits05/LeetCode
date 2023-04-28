class Solution {
    public int lengthOfLIS(int[] a) {
        int n =a.length;
        // int dp[][] = new int[n+1][n+1];
        int next[] = new int[n+1]; int cur[] = new int[n+1];
        
        for(int i=n-1; i>=0; i--){
            for(int j=i-1; j>=-1; j--){
                int len = 0 + next[j+1];
                if(j == -1 || a[i] > a[j]) len = Math.max(len, 1 + next[i+1]);
                
                cur[j+1] = len;
            }
            next = cur;
        }
        
        return next[-1+1];
    }
}