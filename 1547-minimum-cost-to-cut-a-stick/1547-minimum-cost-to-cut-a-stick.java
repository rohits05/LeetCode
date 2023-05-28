class Solution {
    public int minCost(int n, int[] cuts) {
       int c =cuts.length;
       Arrays.sort(cuts);
       ArrayList<Integer> arr = new ArrayList<>();
       for(int i=0; i<c; i++) arr.add(cuts[i]);
        
       arr.add(0, 0);
       arr.add(n);
       int [][] dp = new int[c+2][c+2];
       for(int[] row: dp) Arrays.fill(row, 0);
       
       for(int i=c; i>=1; i--){
           for(int j=1; j<=c; j++){
               if(i > j) continue;
               int mini = Integer.MAX_VALUE;
              for(int ind=i; ind<=j; ind++){
                  mini = Math.min(mini, arr.get(j+1) - arr.get(i-1) + dp[i][ind-1] + dp[ind+1][j]);
              }
            dp[i][j] = mini; 
           }
       }
        
        return dp[1][c];
    }
}