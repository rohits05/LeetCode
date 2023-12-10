class Solution {
    public int lengthOfLIS(int[] a) {
           // Space Optimized !
//         int n =a.length;
//         int next[] = new int[n+1]; int cur[] = new int[n+1];
        
//         for(int i=n-1; i>=0; i--){
//             for(int j=i-1; j>=-1; j--){
//                 int len = 0 + next[j+1];
//                 if(j == -1 || a[i] > a[j]) len = Math.max(len, 1 + next[i+1]);
                
//                 cur[j+1] = len;
//             }
//             next = cur;
//         }
        
//         return next[-1+1];
        
        // Binary Srch !!
        int dp[] = new int[a.length];
        int len = 0;
        for(int num: a){
            int i = Arrays.binarySearch(dp, 0, len, num); // SOF
            if(i < 0) i = -(i + 1);
            
            dp[i] = num;
            if(i == len) len++;
        }
        
        return len;
    }
}

