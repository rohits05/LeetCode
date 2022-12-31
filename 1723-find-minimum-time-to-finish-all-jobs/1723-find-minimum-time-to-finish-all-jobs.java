class Solution {
    int res = Integer.MAX_VALUE;
    public int minimumTimeRequired(int[] jobs, int k) {
        dfs(jobs, new int[k], jobs.length-1, 0);
        return res;
    }
    
    public void dfs(int[] jobs, int[] workers, int pos, int curMax) {
        if(pos == -1){
            res = Math.min(curMax, res);
            return;
        }
        
        if(curMax > res) return;
        for(int i=0; i<workers.length; i++){
            if(i>0 && workers[i] == workers[i-1]) continue;
            workers[i] += jobs[pos];
            dfs(jobs, workers, pos-1, Math.max(curMax, workers[i]));
            workers[i] -= jobs[pos];
        }
    }
}