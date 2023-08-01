class Solution {
    public int maxValue(int[][] events, int k) {
        int n = events.length;
        
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        Integer[][] dp = new Integer[n][k+1];
        
        return dfs(dp, events, 0, k);
    }

    public int dfs(Integer[][] dp,int[][] events, int idx, int k) {
        if(idx == events.length || k == 0 || idx == -1) return 0;
        if(dp[idx][k] != null) return dp[idx][k];

        int nextValidIdx = bs(events, idx+1, events[idx][1]);
        int keepCurrent = events[idx][2] + dfs(dp, events, nextValidIdx, k-1);
        int skipCurrent = dfs(dp, events, idx+1, k);

        return dp[idx][k] = Math.max(keepCurrent, skipCurrent);
    }

    public int bs(int[][] events, int idx, int value) {
        int start = idx, end = events.length-1;
        int res = -1;
        while(start <= end){
            int middle = (end-start)/2+start;
            if(events[middle][0]>value){
                res = middle;
                end = middle-1;
            }
            else start = middle+1;
        }
        
        return res;
    }
}