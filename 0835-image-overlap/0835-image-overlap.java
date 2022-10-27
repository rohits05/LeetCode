class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int ans = 0, n = img1.length, lim = n + n - 1;
    
        int t[][] = new int[n + n + n - 2][n + n + n - 2];

        for(int i=0, r=n-1; i!=n; i++, r++)
          for(int j=0, c=n-1; j!=n; j++, c++)
            t[r][c] = img1[i][j];

        for(int y=0; y!=lim;  y++)
          for(int x=0; x!=lim; x++){
            int tmp = 0;   

            for(int i=0, r=y; i!=n; i++, r++)
              for(int j=0, c=x; j!=n; j++, c++)
                tmp += img2[i][j]&t[r][c];
            if(tmp > ans) ans = tmp;
          }  
        return ans;
    }
}